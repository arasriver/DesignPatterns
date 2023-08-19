package adapter;

import adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {
    private Caramel caramel;
    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);

    }
}
