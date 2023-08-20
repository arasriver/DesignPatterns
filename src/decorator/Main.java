package decorator;


public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCLoudStream(new CloudStream()));
        storeCreditCard(new CompressedCloudStream(new CloudStream()));

    }

    public static void storeCreditCard(Stream stream) {
        stream.write("123456789");
    }


}

