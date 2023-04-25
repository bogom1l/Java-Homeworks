import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@XmlRootElement(name = "MyCalendar")
public class MyCalendar {
    private List<Appointment> appointments;

    public MyCalendar() {
        this.appointments = new ArrayList<>();
    }

    @XmlElement(name = "Appointment")
    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(String date, String startTime, String endTime, String name, String note) {
        Appointment appointment = new Appointment(date, startTime, endTime, name, note);
        appointments.add(appointment);
    }

    public void removeAppointment(String date, String startTime, String endTime) {
        appointments.removeIf(appointment ->
                appointment.getDate().equals(date) &&
                        appointment.getStartTime().equals(startTime) &&
                        appointment.getEndTime().equals(endTime)
        );
    }

    public void displayAppointments(String date) {
        List<Appointment> appointmentsOnDate = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                appointmentsOnDate.add(appointment);
            }
        }
        appointmentsOnDate.sort(Comparator.comparing(Appointment::getStartTime));
        for (Appointment appointment : appointmentsOnDate) {
            System.out.println(appointment.getName() + " - " + appointment.getStartTime() + " to " + appointment.getEndTime());
        }
    }

    public void displayAll() {
        List<Appointment> appointmentsOnDate = new ArrayList<>();
        for (Appointment appointment : appointments) {
            appointmentsOnDate.add(appointment);

        }
        for (Appointment appointment : appointmentsOnDate) {
            System.out.println(appointment.getName() + " (" + appointment.getNote() + ")" + " - " + appointment.getStartTime() + " to " + appointment.getEndTime()
                            + " - " + appointment.getDate());
        }
    }

//    public void saveToFile(String filename) throws IOException {
//        try (XMLEncoder encoder = new XMLEncoder(new FileOutputStream(filename))) {
//            encoder.writeObject(appointments);
//        }
//    }
//
//    public void loadFromFile(String filename) throws IOException {
//        try (XMLDecoder decoder = new XMLDecoder(new FileInputStream(filename))) {
//            List<Appointment> loadedAppointments = (List<Appointment>) decoder.readObject();
//            appointments.clear();
//            appointments.addAll(loadedAppointments);
//        }
//    }


}
