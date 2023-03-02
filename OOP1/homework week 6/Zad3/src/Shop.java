package bg.tu_varna.sit.task3;

public class Shop {

    Item[] items;

    public Shop(Item[] items) {
        this.items = items;
    }

    public int getItemCountDelivery(){
        int sum = 0;
        for(int i=0;i<this.items.length;i++){
            if(this.items[i].needsDelivery()) {
                sum++;
            }
        }

        return sum;
    }

    public int getAverageDaysToExpire(){
        int sum = 0;
        for(int i=0;i<this.items.length;i++){
            sum += this.items[i].daysToExpire;
        }

        return sum / this.items.length;
    }

    public int getAvailableDrinksCount(){
        int sum = 0;
        for(int i=0;i<this.items.length;i++){
            if(this.items[i].isDrinkable()) {
                sum++;
            }
        }

        return sum;
    }
}
