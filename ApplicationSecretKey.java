/**
 * The Ask (Application Secret Key) is a secret key used to generate Dask.
 * The Dask is key used to decrypt the payload of the SKR1 block.
 */
public class ApplicationSecretKey {
    public static final int ASK_SIZE = 16;
    public static final ApplicationSecretKey INST = new ApplicationSecretKey();
    public static final String ASK_FILE_PATH;
    private final byte[] value;

    private ApplicationSecretKey() {
        value = readApplicationSk(ASK_FILE_PATH);
    }

    private byte[] readApplicationSk(String aSK_FILE_PATH2) {
        return new byte[] {};
    }

    static {
        ASK_FILE_PATH = chooseFilePath();
        System.out.println(ASK_FILE_PATH);
    }

    private static String chooseFilePath() {
        System.out.println("chooseFilePath");
        String filePath;
        String appProf = System.getProperty("Dzappprof", "development");
        if ("development".equals(appProf)) {
            filePath = "credentials/live_ask";
        } else {
            filePath = "/zserver/java-projects/ZDRMKeyService/credentials/live_ask";
        }
        return filePath;
    }

    public byte[] getValue() {
        return value;
    }
}
