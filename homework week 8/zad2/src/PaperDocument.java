package bg.tu_varna.sit.task2;

import java.util.Objects;

public class PaperDocument {
    private String title;
    private String dateCreated;
    private int pages;
    private boolean access;

    public PaperDocument(String title, String dateCreated, int pages, boolean access) {
        this.title = title;
        this.dateCreated = dateCreated;
        this.pages = pages;
        this.access = access;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaperDocument)) return false;
        PaperDocument that = (PaperDocument) o;
        return access == that.access && Objects.equals(dateCreated, that.dateCreated);
    }


}
