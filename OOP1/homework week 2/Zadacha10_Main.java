public class Main {
    public static void main(String[] args) {

        MobilePhone[] mobilePhones = new MobilePhone[10];

        String currModel = "model";
        String currStorage = "20";
        String currCamera = "5";
        String currWeight = "10";

        for (int i = 0; i < 10; i++) {
            mobilePhones[i] = new MobilePhone();

            mobilePhones[i].setModel(currModel);
            mobilePhones[i].setStorage(currStorage);
            mobilePhones[i].setWeight(currWeight);
            mobilePhones[i].setCamera(currCamera);

            currModel = currModel + (i + 1);
            currStorage = String.valueOf((i + 6) + 2);
            currCamera = String.valueOf((i + 4) + 4);
            currWeight = String.valueOf((i + 3) * 5);

        }

        double totalWeight = 0;
        int bestCamera = Integer.valueOf(mobilePhones[0].getCamera());
        for (int i = 0; i < mobilePhones.length; i++) {
            totalWeight += Integer.valueOf(mobilePhones[i].getWeight());

            if(Integer.valueOf(mobilePhones[i].getCamera()) > bestCamera) {
                bestCamera = Integer.valueOf(mobilePhones[i].getCamera());
            }
        }

        System.out.println("Average weight = " + totalWeight / mobilePhones.length);
        System.out.println("Best camera = " + bestCamera);
    }
}