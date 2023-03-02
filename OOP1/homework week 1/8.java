public class Main {
    public static void main(String[] args)
    {
        int totalBanichki = 289;
        int purchasesCount = 0;

        while(true) {
            totalBanichki -= 2; //first buyer
            if(totalBanichki < 0){
                System.out.println("last banichki purchased: 2, from the First person in the queue");
                totalBanichki += 2;
                break;
            }
            purchasesCount++;

            totalBanichki -= 4; //second buyer
            if(totalBanichki < 0){
                System.out.println("last banichki purchased: 4, from the Second person in the queue");
                totalBanichki += 4;
                break;
            }
            purchasesCount++;

            totalBanichki -= 1; //third buyer
            if(totalBanichki < 0){
                System.out.println("last banichki purchased: 1, from the Third person in the queue");
                totalBanichki += 1;
                break;
            }
            purchasesCount++;
        }


        System.out.print("The number of people that bought banichki is: ");
        System.out.println(purchasesCount);

        //System.out.println(totalBanichki);
        if(totalBanichki == 0) {
            System.out.println("Yes, the last person bought the needed count of banichki.");
        }
    }
}