public class Adult extends Pacient {
    private String name;
    private int assuranceNumber;

    public Adult(String name, int assuranceNumber) {
        this.name = name;
        this.assuranceNumber = assuranceNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' + "AssuranceNumber: " + assuranceNumber;
    }
}
