public class Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket("biletZaKino", 10);
        StandartTicket standartTicket = new StandartTicket("biletZaTeatar", 1, true);
        TicketForStudents ticketForStudents = new TicketForStudents("biletZaAvtobus", 2, "Ivan");
        GroupTicket groupTicket = new GroupTicket("biletZaPluvane", 5);

        groupTicket.addParticipant();
        groupTicket.addParticipant();
        groupTicket.addParticipant();
        System.out.println(groupTicket.getPrice());

        groupTicket.addParticipant();
        System.out.println(groupTicket.getPrice());

    }
}