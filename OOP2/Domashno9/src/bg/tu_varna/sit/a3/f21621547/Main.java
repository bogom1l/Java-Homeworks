package bg.tu_varna.sit.a3.f21621547;

public class Main {
    public static void main(String[] args) {

        Handler manager = new Manager();
        Handler boss = new Boss();

        manager.setSuccessor(boss);

        Request leaveRequest = new Request("Leave", "Molba za napuskane ot Pesho");
        Command leaveRequestCommand = new LeaveRequestCommand(manager, leaveRequest);
        leaveRequestCommand.execute();

        Request hiringRequest = new Request("Hire", "Kandidatstvane za rabota ot Ivan");
        Command hiringRequestCommand = new HiringRequestCommand(boss, hiringRequest);
        hiringRequestCommand.execute();


        Request hiringRequest2 = new Request("Promote", "Vdigane na zaplata");
        Command hiringRequestCommand2 = new HiringRequestCommand(boss, hiringRequest2);
        hiringRequestCommand2.execute();
    }
}