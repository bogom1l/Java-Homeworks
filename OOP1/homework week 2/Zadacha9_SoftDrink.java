import java.util.Objects;
public class SoftDrink {

    private String nickname;
    private String dateOfExpire;
    private String volume;
    private String sugarPer100ml;

    public SoftDrink(String nickname, String dateOfExpire, String volume, String sugarPer100ml) {
        this.nickname = nickname;
        this.dateOfExpire = dateOfExpire;
        this.volume = volume;
        this.sugarPer100ml = sugarPer100ml;
    }

    public String getNickname() {
        return nickname;
    }

    public String getDateOfExpire() {
        return dateOfExpire;
    }

    public String getVolume() {
        return volume;
    }

    public String getSugarPer100ml() {
        return sugarPer100ml;
    }

    public String toString() {
        return "SoftDrink{" +
                "nickname='" + nickname + '\'' +
                ", dateOfExpire='" + dateOfExpire + '\'' +
                ", volume='" + volume + '\'' +
                ", sugarPer100ml='" + sugarPer100ml + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftDrink softDrink = (SoftDrink) o;
        return Objects.equals(nickname, softDrink.nickname)
                && Objects.equals(sugarPer100ml, softDrink.sugarPer100ml);
    }

}
