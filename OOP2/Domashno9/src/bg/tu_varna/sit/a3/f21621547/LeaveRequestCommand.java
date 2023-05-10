package bg.tu_varna.sit.a3.f21621547;

public class LeaveRequestCommand implements Command {
    private Handler handler;
    private Request request;

    public LeaveRequestCommand(Handler handler, Request request) {
        this.handler = handler;
        this.request = request;
    }

    public void execute() {
        handler.handleRequest(request);
    }
}