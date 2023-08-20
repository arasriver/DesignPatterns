package factoryMethod;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller{
    public void listProduct() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }
}
