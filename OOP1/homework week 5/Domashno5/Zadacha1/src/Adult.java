package bg.tu_varna.sit.task1;

public class Adult extends Person{
    private IdentificationCard id;

    @Override
    public String toString() {
        return this.getThirdName() + this.getSecondName()  + this.getFirstName() +
                '\n' + this.id.getNumber() + "  " + this.id.publishedBy();
    }
}
