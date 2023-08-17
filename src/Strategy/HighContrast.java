package Strategy;

public class HighContrast implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Image is in High Contrast");
    }
}
