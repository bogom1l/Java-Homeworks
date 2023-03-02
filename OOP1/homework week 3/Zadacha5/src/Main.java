public class Main {
    public static void main(String[] args) {

        City city = new City("Varna", 9000);

        IdentificationCard id = new IdentificationCard(1, 2015, "0012456792", city);

        Adult adult = new Adult();
        adult.setFirstName("ivan");
        adult.setSecondName("petrov");
        adult.setThirdName("kaloqnov");
        adult.setId(id);

        System.out.println(adult.personalInformation());

    }
}