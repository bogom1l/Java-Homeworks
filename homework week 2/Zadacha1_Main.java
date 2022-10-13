public class Main {
    public static void main(String[] args) {

        Item[] items = new Item[10];

        String currType = "Type0";
        int currQuantity = 1;
        int currPrice = 10;
        int currDays = 5;

	//filling the arrayy
        for (int i = 0; i < 10; i++) {

            items[i] = new Item(currType, currQuantity, currPrice, currDays);

            currType = currType.replace(String.valueOf(i), String.valueOf(i+1));
            currQuantity++;
            currPrice += 10;
            currDays += 5;
        }

        //printing out the array
        for (int i = 0; i < 10; i++) {
            Item currItem = items[i];

            System.out.println(currItem);
        }

        //average price
        double totalPrice = 0;

        for (int i = 0; i < 10; i++) {
            Item currItem = items[i];

            totalPrice += currItem.getPrice();
        }

        double averagePrice = totalPrice / items.length;
        System.out.println("Average price = " + averagePrice);
    }
}