public class Main {
    public static void main(String[] args) {

       Notebook[] notebooks = new Notebook[10];

        for (int i = 0; i <= 5; i++) {
            notebooks[i] = new Notebook();
            notebooks[i].setPages((i + 1) * 3);
            notebooks[i].setPrice((i + 3) * 5);
            notebooks[i].setWithHardMaterial(true);
        }

        notebooks[6] = new Notebook(15,150,false);
        notebooks[7] = new Notebook(211,188,false);
        notebooks[8] = new Notebook(15000,8845,true);
        notebooks[9] = new Notebook(4,400,false);

        int sum = 0;
        for (int i = 0; i < notebooks.length; i++) {
            if(!notebooks[i].isWithHardMaterial()) {
                System.out.println(notebooks[i]);
            }
            sum += notebooks[i].getPrice();
        }

        System.out.println("average price = " + sum / notebooks.length);


    }
}