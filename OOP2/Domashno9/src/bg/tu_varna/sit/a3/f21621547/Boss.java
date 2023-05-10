package bg.tu_varna.sit.a3.f21621547;

public class Boss implements Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("Hire")) {
            System.out.println("Boss approves hiring request: " + request.getDescription());
        } else if (successor != null) {
            successor.handleRequest(request);
        } else {
            System.out.println("This request could not be handled.");
        }
    }
}