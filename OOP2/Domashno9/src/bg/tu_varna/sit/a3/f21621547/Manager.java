package bg.tu_varna.sit.a3.f21621547;

public class Manager implements Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("Leave")) {
            System.out.println("Manager approves leave request: " + request.getDescription());
        } else if (successor != null) {
            successor.handleRequest(request);
        } else {
            System.out.println("This request could not be handled.");
        }
    }
}
