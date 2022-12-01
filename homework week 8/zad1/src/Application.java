public class Application {
    public static void main(String[] args) {


        try {
            Pacient child = new Child("Gosho",13,55);
            System.out.println(child);

            Medical medical = new Medical(child, "damaged");
            System.out.println(medical.getPrescription());

        } catch (InvalidAgeException ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }



    }
}