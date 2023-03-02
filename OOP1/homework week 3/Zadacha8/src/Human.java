public class Human {
    protected String fName;
    protected String sName;
    protected String lName;
    protected String gender; // male/female/other
    protected int age;

    protected Human() {}
    public Human(String fName, String sName, String lName, String gender, int age) {
        this.fName = fName;
        this.sName = sName;
        this.lName = lName;
        this.gender = gender;
        this.age = age;
    }
}
