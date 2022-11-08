package bg.tu_varna.sit.task5;

public class CompanyLtd extends Company{

    private double capital;
    private double profit;

    @Override
    double dyljimDanyk() {
        if(incomes - costs > 0){
            return incomes - costs;
        }

        return 0;
    }
}
