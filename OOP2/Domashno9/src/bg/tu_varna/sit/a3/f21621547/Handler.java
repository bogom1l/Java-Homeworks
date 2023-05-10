package bg.tu_varna.sit.a3.f21621547;

public interface Handler {
    void setSuccessor(Handler successor);
    void handleRequest(Request request);
}