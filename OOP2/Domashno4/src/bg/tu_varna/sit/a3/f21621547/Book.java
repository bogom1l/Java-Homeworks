package bg.tu_varna.sit.a3.f21621547;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int basePrice;
    private String summary;
    private List<Page> pages;

    public Book(int basePrice, String summary) {
        this.basePrice = basePrice;
        this.summary = summary;
        this.pages = new ArrayList<>();
    }

    public void addPage(Page page) {
        this.pages.add(page);
    }

    public int getPrice() {
        return this.basePrice;
    }

    public String getSummary() {
        return this.summary;
    }
}