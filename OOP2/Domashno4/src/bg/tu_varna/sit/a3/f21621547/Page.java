package bg.tu_varna.sit.a3.f21621547;

public class Page {
    private int pageNumber;
    private String text;

    public Page(int pageNumber, String text) {
        this.pageNumber = pageNumber;
        this.text = text;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public String getText() {
        return this.text;
    }
}