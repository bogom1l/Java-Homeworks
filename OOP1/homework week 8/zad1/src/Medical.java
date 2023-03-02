public class Medical {
    private Pacient pacient;
    private String condition;

    public Medical(Pacient pacient, String condition) {
        this.pacient = pacient;
        this.condition = condition;
    }

    public double calculatePotion(){
        if(this.pacient instanceof Child) {
            return (int)(0.25*((Child) this.pacient).weight);
        }

        if(this.condition == "damaged") {
            return 50;
        }

        return 25;
    }

    public String getPrescription() {
        return this.pacient + "\nDose: " + calculatePotion();
    }

}
