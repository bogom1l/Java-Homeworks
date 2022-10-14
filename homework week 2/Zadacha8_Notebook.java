import java.util.Objects;

public class Notebook {

    private int pages;
    private double price;
    private boolean isWithHardMaterial;

    public Notebook() {}
    public Notebook(int pages, double price, boolean isWithHardMaterial) {
        this.pages = pages;
        this.price = price;
        this.isWithHardMaterial = isWithHardMaterial;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWithHardMaterial() {
        return isWithHardMaterial;
    }

    public void setWithHardMaterial(boolean withHardMaterial) {
        isWithHardMaterial = withHardMaterial;
    }

    public String toString() {
        return "Notebook{" +
                "pages=" + pages +
                ", price=" + price +
                ", isWithHardMaterial=" + isWithHardMaterial +
                '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return pages == notebook.pages && Double.compare(notebook.price, price) == 0 && isWithHardMaterial == notebook.isWithHardMaterial;
    }

}
