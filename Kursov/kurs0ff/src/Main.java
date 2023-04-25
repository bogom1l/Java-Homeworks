import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            CalendarManager calendarManager = new CalendarManager();
            calendarManager.start();
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        } catch (CustomException ex) {
            ex.printStackTrace();
        }


    }
}