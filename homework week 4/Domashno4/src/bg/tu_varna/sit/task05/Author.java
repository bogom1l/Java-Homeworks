package bg.tu_varna.sit.task05;

public class Author {

    private String firstName;
    private String lastName;
    private String genre;

    public Author(String firstName, String lastName, String genre) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Author{" +
                "First name: " + firstName +
                ", Last name: " + lastName+
                ", Genre: " + genre +
                "}";
    }
}
