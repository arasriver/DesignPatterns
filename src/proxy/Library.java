package proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, EbookProxy> ebooks = new HashMap<>();
    public void add(EbookProxy ebook){
        ebooks.put(ebook.getFileName(), ebook);

    }

    public void openEbook(String fileName) {
        EbookProxy proxy = ebooks.get(fileName);
        proxy.show();
    }
}
