public class TicketForStudents extends StandartTicket{

    private String name;

    public TicketForStudents(String e, double p, String name) {
        super(e,p/2);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
