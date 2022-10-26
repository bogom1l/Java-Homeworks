public class Person {
    protected String firstName;
    protected String secondName;
    protected String thirdName;

    //Няма да ползвам инициализиране на класа Person затова му защитавам всички полета и позволявам само
    //да могат да бъдат наследени от класът Adult
    protected String iAm() {
        return getThirdName() + " " + getSecondName() + " " + getFirstName();
    }
    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String getSecondName() {
        return secondName;
    }

    protected void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    protected String getThirdName() {
        return thirdName;
    }

    protected void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }
}
