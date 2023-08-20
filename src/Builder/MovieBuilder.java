package Builder;

public class MovieBuilder implements PresentationBuilder {
    private Movie movie = new Movie();
    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 3);
    }
}
