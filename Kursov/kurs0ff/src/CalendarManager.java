import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CalendarManager {
    MyCalendar myCalendar = null;
    Scanner scanner = new Scanner(System.in);
    XMLHandler<MyCalendar> handler = new XMLHandler<>(MyCalendar.class);
    String filePath = null;
    public CalendarManager() { }

    public void start() throws JAXBException, IOException, CustomException, ParseException {

        while (true) {
            System.out.println("Enter a command (open, close, save, saveAs, book, unbook, agenda, displayAll, change, find, holiday, busydays, findslot, exit): ");
            String command = scanner.next();

            if (command.equals("book")) {
                book();
            } else if (command.equals("unbook")) {
                unbook();
            } else if (command.equals("agenda")) {
                agenda();
            } else if (command.equals("displayAll")) {
                displayAll();
            } else if (command.equals("open")) {
                open();
            } else if (command.equals("close")) {
                close();
            } else if (command.equals("save")) {
                save();
            } else if (command.equals("saveAs")) {
                saveAs();
            } else if (command.equals("change")) {
                change();
            } else if (command.equals("find")) {
                find();
            } else if (command.equals("holiday")) {
                holiday();
            } else if (command.equals("busydays")) {
                busydays();
            } else if (command.equals("findslot")) {
                findslot();
            } else if (command.equals("help")) {
                help();
            } else if (command.equals("exit")) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }

    public void book() throws CustomException {

        if (myCalendar == null) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = scanner.next();

        System.out.println("Enter start time (HH:MM):");
        String startTime = scanner.next();

        System.out.println("Enter end time (HH:MM):");
        String endTime = scanner.next();

        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter note:");
        String note = scanner.next();

        myCalendar.addAppointment(date, startTime, endTime, name, note);

        System.out.println("Appointment added.");
    }

    public void unbook() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = scanner.next();

        System.out.println("Enter start time (HH:MM):");
        String startTime = scanner.next();

        System.out.println("Enter end time (HH:MM):");
        String endTime = scanner.next();

        myCalendar.removeAppointment(date, startTime, endTime);
        System.out.println("Appointment removed.");
    }

    public void agenda() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = scanner.next();

        myCalendar.displayAppointments(date);
    }

    public void displayAll() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        myCalendar.displayAll();
    }

    public void open() throws IOException, JAXBException {
        if (isCurrentFileOpened()) {
            System.out.println("A file is already opened, please select another option.\n");
            //ne prikluchwame programata, a prosto karame user-a da izbere druga opciq, po-udobno e
            return;
        }

        System.out.println("Enter file path: ");
        filePath = scanner.next();

        handler.open(filePath);
        myCalendar = handler.read();

        System.out.println("Successfully opened " + filePath);
    }

    public void close() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        handler.close();
        System.out.println("Successfully closed " + filePath);
        myCalendar = null;
    }

    public void save() throws JAXBException, IOException, CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        handler.save(myCalendar);
        System.out.println("Successfully saved " + filePath);
    }

    public void saveAs() throws CustomException, JAXBException, IOException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter pathToSave:");
        String pathToSave = scanner.next();

        handler.saveAs(myCalendar, pathToSave);
        System.out.println("Successfully saved as: " + pathToSave);
    }

    public void help() {
        StringBuilder sb = new StringBuilder();
        sb.append("The following commands are supported:\n");
        sb.append("open <file> \topens <file>\n");
        sb.append("close \t\t\tcloses currently opened file\n");
        sb.append("save \t\t\tsaves the currently open file\n");
        sb.append("saveAs <file> \tsaves the currently open file in <file>\n");
        sb.append("help \t\t\tprints this information\n");
        sb.append("exit \t\t\texists the program\n");
        System.out.println(sb);
    }

    public void find() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter note: ");
        String note = scanner.next();

        List<Appointment> appointments = myCalendar.getAppointments();
        for (Appointment appointment : appointments) {
            if (appointment.getNote().contains(note)
                    || appointment.getName().contains(note)) {
                System.out.println(appointment.toString());
            }
        }
    }

    public void change() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter date: ");
        String date = scanner.next();

        System.out.println("Enter startTime: ");
        String startTime = scanner.next();

        Appointment appointment = myCalendar.getAppointmentByDateAndStartTime(date, startTime);

        if (appointment == null) {
            System.out.println("Appointment not found.");
            return;
        }

        System.out.println("Enter option(date, startTime, endTime, name, note): ");
        String option = scanner.next();

        System.out.println("Enter newValue: ");
        String newValue = scanner.next();

        switch (option) {
            case "date":
                appointment.setDate(newValue);
                break;
            case "startTime":
                appointment.setStartTime(newValue);
                break;
            case "endTime":
                appointment.setEndTime(newValue);
                break;
            case "name":
                appointment.setName(newValue);
                break;
            case "note":
                appointment.setNote(newValue);
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }

        System.out.println("Appointment changed successfully.");
    }

    public void holiday() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter date: ");
        String date = scanner.next();

        List<Appointment> appointments = myCalendar.getAppointments();
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                appointment.setIsHoliday(true);

                System.out.println(appointment.toString());

                System.out.println("Successfully changed the date to holiday.");
                return;
            }
        }
    }

    public void busydays() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter start date(from): ");
        String fromDate = scanner.next();

        System.out.println("Enter end date(to): ");
        String toDate = scanner.next();

        LocalDate from = LocalDate.parse(fromDate);
        LocalDate to = LocalDate.parse(toDate);

        List<Appointment> filteredAppointments = new ArrayList<Appointment>();

        List<Appointment> appointments = myCalendar.getAppointments();
        for (Appointment appointment : appointments) {
            LocalDate currentDate = LocalDate.parse(appointment.getDate());
            if (currentDate.isAfter(from) && currentDate.isBefore(to)) {
                filteredAppointments.add(appointment);
            }
        }

        Collections.sort(filteredAppointments, new Comparator<Appointment>() {
            public int compare(Appointment a1, Appointment a2) {
                LocalDate date1 = LocalDate.parse(a1.getDate());
                LocalDate date2 = LocalDate.parse(a2.getDate());
                return date1.compareTo(date2);
            }
        });

        for (Appointment appointment : filteredAppointments) {
            System.out.println(appointment.toString());
        }
    }

    public void findslot() throws CustomException {
        if (!isCurrentFileOpened()) {
            throw new CustomException("FileNotOpened");
        }

        System.out.println("Enter from date: ");
        String fromDate = scanner.next();

        LocalDate fromDateLocalDate = convertToLocalDate(fromDate);

        System.out.println("Enter hours: ");
        int hours = scanner.nextInt();
        int minutes = hours * 60;

        List<Appointment> appointments = myCalendar.getAppointments();
        for (Appointment appointment : appointments) {
            String[] startTimeInMinutesSplitted = appointment.getStartTime().split(":");

            int startTimeInMinutes = Integer.parseInt(startTimeInMinutesSplitted[0]) * 60
                    + Integer.parseInt(startTimeInMinutesSplitted[1]);

            String[] endTimeInMinutesSplitted = appointment.getEndTime().split(":");

            int endTimeInMinutes = Integer.parseInt(endTimeInMinutesSplitted[0]) * 60
                    + Integer.parseInt(endTimeInMinutesSplitted[1]);

            int totalFreeMinutes = (endTimeInMinutes - startTimeInMinutes);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime stTime = LocalTime.parse(appointment.getStartTime(), formatter);
            LocalTime eTime = LocalTime.parse(appointment.getStartTime(), formatter);

            LocalTime startBoundary = LocalTime.parse("08:00", formatter);
            LocalTime endBoundary = LocalTime.parse("17:00", formatter);

            LocalDate currentLocalDate = convertToLocalDate(appointment.getDate());

            if(!appointment.getIsHoliday()
                    && !stTime.isBefore(startBoundary)
                    && !eTime.isAfter(endBoundary)
                    && totalFreeMinutes >= minutes
                    && currentLocalDate.isAfter(fromDateLocalDate)) {
                System.out.println(appointment.toString());
            }
        }
    }

    public boolean checkForValidData(String date1, String date2) {

        return true;
    }


    public static LocalDate convertToLocalDate(String date){
        String format = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }

    private boolean isCurrentFileOpened() {
        if(myCalendar == null) {
            return false; //throw new CustomException("FileNotOpened");
        }
        return true;
    }
}
