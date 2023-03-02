public class Adult extends Person{
    private IdentificationCard id;

    public IdentificationCard getId() {
        return id;
    }
    public void setId(IdentificationCard id) {
        this.id = id;
    }
    public String personalInformation() {
        String answer = iAm() + "\n";
        answer += "Лична карта номер: " + this.id.getNumber() + "\tИздадена от: " + this.id.publishedBy();

        return answer;
    }

}
