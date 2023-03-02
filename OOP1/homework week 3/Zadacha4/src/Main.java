import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Pluvane", "10 oct 2010","12345678AA");

        CompanyLtd companyLtd = new CompanyLtd("Pluvane", "10 oct 2010","12345678AB", "PluvaneOOD", 100, 500);

        System.out.println(companyLtd.getDate());

        System.out.println(companyLtd.findDifferenceInCapital());

    }
}