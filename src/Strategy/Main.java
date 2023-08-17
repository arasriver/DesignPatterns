package Strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("a", new PngCompressor(), new BandW());
        imageStorage.store("a", new JpegCompressor(), new HighContrast());

    }
}
