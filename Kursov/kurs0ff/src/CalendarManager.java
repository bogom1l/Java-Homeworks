import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CalendarManager {
    MyCalendar myCalendar = null;
    Scanner scanner = new Scanner(System.in);
    XMLHandler<MyCalendar> handler = new XMLHandler<>(MyCalendar.class);
    String filePath = null;
    public CalendarManager() {
        //this.myCalendar = new MyCalendar(); // throws JAXBException //useless?
        //this.myCalendar = null;
    }

    public void start() throws JAXBException, IOException, CustomException {

        while (true) {
            System.out.println("Enter a command (open, close, save, add, remove, display, displayAll, exit): ");
            String command = scanner.next();

            if (command.equals("add")) { // TODO: rename to 'book'
                add();
            }
            else if (command.equals("remove")) { // TODO: rename to 'unbook'
                remove();
            }
            else if (command.equals("display")) { // TODO: rename to 'agenda'
                display();
            }
            else if (command.equals("displayAll")) { //unnecessary, but helpful
                displayAll();
            }
            else if (command.equals("open")) {
                open();
            }
            else if (command.equals("close")) {
                close();
            }
            else if (command.equals("save")) {
                save();
            }
            else if (command.equals("saveAs")) {
                saveAs();
            }
            else if (command.equals("help")) {
                help();
            }
            else if (command.equals("exit")) {
                System.out.println("Exiting the program...");
                break;
            }
            else {
                System.out.println("Invalid command.");
            }
        }
        //scanner.close();
    }

    public void add() throws CustomException {

        if(myCalendar == null) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = (scanner.next());

        System.out.println("Enter start time (HH:MM):");
        String startTime = (scanner.next());

        System.out.println("Enter end time (HH:MM):");
        String endTime = (scanner.next());

        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter note:");
        String note = scanner.next();

        myCalendar.addAppointment(date,startTime,endTime,name,note);

        System.out.println("Appointment added.");
    }

    public void remove() throws CustomException {
        if(!isCurrentFileOpened()){
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = (scanner.next());

        System.out.println("Enter start time (HH:MM):");
        String startTime = (scanner.next());

        System.out.println("Enter end time (HH:MM):");
        String endTime = (scanner.next());

        myCalendar.removeAppointment(date, startTime, endTime);
        System.out.println("Appointment removed.");
    }

    public void display() throws CustomException {
        if(!isCurrentFileOpened()){
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = (scanner.next());

        myCalendar.displayAppointments(date);
    }

    public void displayAll() throws CustomException {
        if(!isCurrentFileOpened()){
            throw new CustomException("FileNotOpened");
        }

        myCalendar.displayAll();
    }

    public void open() throws IOException, JAXBException, CustomException {
        if(isCurrentFileOpened()){
            System.out.println("A file is already opened, please select another option.\n");
            return;
        }

        System.out.println("Enter file path: ");
        filePath = (scanner.next());

        // Open the specified file and load its contents into the calendar
        handler.open(filePath); // + ".xml"

        // read the XML file into a Java object
        myCalendar = handler.read();

        System.out.println("Successfully opened " + filePath);
    }

    public void close() throws CustomException {
        if(!isCurrentFileOpened()){
            throw new CustomException("FileNotOpened");
        }

        handler.close();
        System.out.println("Successfully closed " + filePath);
    }

    public void save() throws JAXBException, IOException, CustomException {
        if(!isCurrentFileOpened()){
            throw new CustomException("FileNotOpened");
        }

        handler.save(myCalendar);
        System.out.println("Successfully saved " + filePath);
    }

    public void saveAs() throws CustomException {
        if(!isCurrentFileOpened()){
            throw new CustomException("FileNotOpened");
        }

        // Save the contents of the calendar to the specified file
        System.out.println("DOESNT WORK FOR NOW");
        System.out.println("Successfully saved as: " + filePath);
    }

    public void help() {
        StringBuilder sb = new StringBuilder();
        sb.append("The following commands are supported:\n");
        sb.append("open <file> \topens <file>\n");
        sb.append("close \t\t\tcloses currently opened file\n");
        sb.append("save \t\t\tsaves the currently open file\n");
        sb.append("saveas <file> \tsaves the currently open file in <file>\n");
        sb.append("help \t\t\tprints this information\n");
        sb.append("exit \t\t\texists the program\n");
        System.out.println(sb);
    }

    public void find() throws JAXBException, CustomException {
        if(!isCurrentFileOpened()){
            throw new CustomException("FileNotOpened");
        }

        System.out.println("DOESNT WORK FOR NOW");

        // use the Java object
        List<Appointment> appointments = myCalendar.getAppointments();
        for (Appointment appointment : appointments) {
            System.out.println(appointment.getName());
        }
    }

    public void modify() throws JAXBException, CustomException {

        if(!isCurrentFileOpened()){
            throw new CustomException("FileNotOpened");
        }

        System.out.println("DOESNT WORK FOR NOW");

        List<Appointment> appointments = myCalendar.getAppointments();
        // modify the Java object
        Appointment newAppointment2 = new Appointment("2011-11-11", "11:00", "12:00", "modifyMethodMadeMe", "I am bad boy");
        appointments.add(newAppointment2);
    }

    private boolean isCurrentFileOpened() {
        if(myCalendar == null) {
            return false; //throw new CustomException("FileNotOpened");
        }
        return true;
    }


}
