public class GroupTicket extends Ticket{
    private static final int maxCount = 20;
    private int participantsCount;

    public GroupTicket(String e, double p) {
        super(e, p*20);
        this.participantsCount = 0;
    }

    public void addParticipant() {
        if(this.participantsCount <= maxCount) {
            this.price -= 2;
        }
    }

    public int getParticipantsCount() {
        return participantsCount;
    }
}
