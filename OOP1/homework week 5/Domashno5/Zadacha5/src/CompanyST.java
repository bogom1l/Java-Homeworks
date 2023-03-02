package bg.tu_varna.sit.task5;

public class CompanyST extends Company{

    private String owner;
    private boolean isPatentActivity;

    @Override
    double dyljimDanyk() {
        if(this.isPatentActivity) {
            return 500;
        }
        if(this.incomes > 0) {
            return incomes*0.15;
        }

        return 0;
    }
}
