import Florida.Miami;
import Ohio.Cleveland;
import Texas.Austin;

public class SalasTaxCalculator {
    public static void main(String[] args) {
        System.out.println(Miami.getTaxRate());
        System.out.println(Cleveland.getTaxRate());
        System.out.println(Texas.Austin.getTaxRate());
    }
}
