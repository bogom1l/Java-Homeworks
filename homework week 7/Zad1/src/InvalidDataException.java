package bg.tu_varna.sit.task1;

public class InvalidDataException extends Exception {
    void throwException() {
        try {
            throw new Exception("ERROR");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
