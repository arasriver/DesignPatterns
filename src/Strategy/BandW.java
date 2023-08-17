package Strategy;

public class BandW implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Image is being Black and White");
    }
}
