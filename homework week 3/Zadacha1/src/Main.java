public class Main {
    public static void main(String[] args) {

    Printer printer = new Printer();
    Machine machine = new Machine();

        printer.setPrice(1.5);
        System.out.println(printer.getPrice());

        printer.setNumberOfPages(4);
        System.out.println(printer.getNumberOfPages());

        machine.setPrice(2.7);
        System.out.println(machine.getPrice());



    }
}