import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set words = new HashSet<String>();
        long totalTime = 0;
        Integer in = 1000000;
        while (in > 0) {
            String word = new String(randomByte());
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
            in--;
        }

        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20 && iter.hasNext(); i++)
            System.out.println(iter.next());
        System.out.println(". . .");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
    }

    private static byte[] randomByte() {
        byte[] bytes = new byte[16];
        SecureRandom rSecureRandom = new SecureRandom();
        rSecureRandom.nextBytes(bytes);
        return bytes;
    }
}
