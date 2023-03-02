package bg.tu_varna.sit.task1;

public class Person {
    protected String firstName;
    protected String secondName;
    protected String thirdName;

    @Override
    public String toString() {
        return thirdName + secondName  + firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }
}
