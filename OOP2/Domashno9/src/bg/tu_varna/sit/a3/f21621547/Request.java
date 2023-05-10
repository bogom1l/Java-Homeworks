package bg.tu_varna.sit.a3.f21621547;

public class Request {
    private String type;
    private String description;

    public Request(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}