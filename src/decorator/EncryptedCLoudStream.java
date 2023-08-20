package decorator;

public class EncryptedCLoudStream implements Stream{
    private Stream stream;
    public EncryptedCLoudStream(Stream stream) {
        this.stream = stream;
    }


    @Override
    public void write(String data){
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data){
        return "*******";
    }

}
