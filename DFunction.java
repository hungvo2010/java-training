import java.util.Arrays;

/**
 * The Derivation Function for Derived Application Secret key (DASk) computation
 * Dask = DFunction(AP(R2, Ask))
 */
public class DFunction {
    public static final DFunction INST = new DFunction();
    private final long PRIME = 813416437;
    private final int ROUND = 16;
    private final int R2_PADDING_SIZE = 64;

    private static byte[] convertIntArraysToByteArray(int[] data) {
        byte[] result = new byte[data.length];
        for (int i = 0; i < data.length; ++i) {
            result[i] = (byte) data[i];
        }
        return result;
    }

    public byte[] hashSpcR2(byte[] r2) {
        byte[] padding = paddingOperation(r2);
        byte[] hashing = hashingOperation(padding);
        return Arrays.copyOfRange(hashing, 0, 16);
    }

    private byte[] hashingOperation(byte[] data) {
        // return DigestUtils.sha1(data);
        return data;
    }

    private byte[] paddingOperation(byte[] r2) {
        if (!isValidBytes(r2)) {
            throw new IllegalArgumentException();
        }
        int[] pad = paddingR2(r2);
        long[] MBlocks = decomposeIntoMBlocks(pad);
        setRemainingBitsOfR2Padding(pad, MBlocks);
        return convertIntArraysToByteArray(pad);
    }

    private int[] paddingR2(byte[] r2) {
        int[] pad = new int[R2_PADDING_SIZE];

        for (int i = 0; i < r2.length; ++i) {
            pad[i] = r2[i] & 0xFF;
        }
        pad[r2.length] = 0x80;

        return pad;
    }

    private long[] decomposeIntoMBlocks(int[] pad) {
        long[] mBlocks = new long[14];
        for (int i = 0; i < mBlocks.length; ++i) {
            // M_i (M_0 = (pad[0] << 24) ^ ... ^ pad[3])
            long temp = (pad[4 * i] << 24) ^ (pad[4 * i + 1] << 16)
                    ^ (pad[4 * i + 2] << 8) ^ (pad[4 * i + 3]);
            mBlocks[i] = temp < 0 ? temp + (long) Math.pow(2, 32) : temp;
        }
        System.out.println(Arrays.toString(mBlocks));
        return mBlocks;
    }

    private void setRemainingBitsOfR2Padding(int[] pad, long[] mBlocks) {
        for (int i = 0; i < 2; ++i) {
            // temp = M_(0 + 7*i) + M_(1 + 7*i) + ... + M_(6 + 7*i)
            // crVal = C_r(temp)
            // pad[56 + 4 * i] = val & 0xFF; ... ; pad[59 + 4 * i] = (val >> 24) & 0xFF;
            long temp = sumOfRange(mBlocks, 7 * i, 7);
            long crVal = C_r(temp);
            System.out.println(crVal);
            for (int j = 0; j < 4; ++j) {
                pad[56 + j + 4 * i] = (byte) (crVal >> (j * 8));
            }
        }
    }

    private long sumOfRange(long[] mBlocks, int start, int length) {
        long total = 0;
        for (int i = start; i < start + length; ++i) {
            total += mBlocks[i];
        }
        return total;
    }

    private boolean isValidBytes(byte[] data) {
        return data != null && data.length > 0;
    }

    public byte[] hashSpcR2V2(byte[] r2) {
        int[] pad = new int[64];
        // Arrays.fill(pad, (byte) 0);
        long[] MBlock = new long[14];
        int r, P, i, R2_sz;
        P = 813416437;
        int NB_RD = 16;
        R2_sz = r2.length;
        if (R2_sz == 0) {
            return new byte[] {
                    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0xa, 0xb, 0xc, 0xd, 0xe, 0xf
            };
        }
        ;
        for (i = 0; i < R2_sz; ++i) {
            pad[i] = r2[i] & 0xFF;
        }
        pad[R2_sz] = 0x80;
        // Arrays.fill(pad, R2_sz + 1, 56, (byte) 0);
        int[] extPad = pad;
        for (i = 0; i < 14; i++) {
            MBlock[i] = (extPad[4 * i] << 24) ^ (extPad[4 * i + 1] << 16) ^ (extPad[4 * i + 2] << 8)
                    ^ (extPad[4 * i + 3]);
        }
        System.out.println(Arrays.toString(MBlock));
        for (i = 1; i < 7; i++) {
            MBlock[0] += MBlock[i];
        }

        MBlock[1] = 0;
        for (i = 0; i < 7; i++) {
            MBlock[1] += MBlock[i + 7];
        }
        for (i = 0; i < 2; i++) {
            for (r = 0; r < NB_RD; r++) {
                if ((MBlock[i] & 1) == 1) {
                    MBlock[i] >>= 1;
                } else {
                    MBlock[i] = (3 * MBlock[i] + 1) % P;
                    // 606302281, 0
                }
            }
        }
        System.out.println(MBlock[0]);
        System.out.println(MBlock[1]);

        for (i = 0; i < 4; i++) {
            pad[56 + i] = (int) (MBlock[0] >> (8 * i));
            pad[60 + i] = (int) (MBlock[1] >> (8 * i));
        }

        // pad have to 64 size
        byte[] sha1Pad = convert(pad);

        return Arrays.copyOfRange(sha1Pad, 0, 16);
    }

    private byte[] convert(int[] pad) {
        byte[] temp = new byte[pad.length];
        for (int i = 0; i < temp.length; ++i) {
            temp[i] = (byte) pad[i];
        }
        return temp;
    }

    private int[] copyPad(int[] pad) {
        int[] extPad = new int[pad.length];
        for (int i = 0; i < pad.length; i++) {
            extPad[i] = pad[i];
        }
        return extPad;
    }

    private long C_r(long x) {
        long y = x;
        for (int i = 0; i < ROUND; ++i) {
            if ((y & 1) == 1) {
                y = y >> 1;
            } else {
                y = (3 * y + 1) % PRIME;
            }
        }
        return y;
    }
}
