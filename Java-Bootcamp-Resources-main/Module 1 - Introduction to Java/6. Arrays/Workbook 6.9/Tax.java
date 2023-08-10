import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};

        // See instructions on Learn the Part (Workbook 6.9)
        System.out.println("The original prices are: <original prices>");
        System.out.print(Arrays.toString(price));

        double[] afterTax = new double[price.length];
        for(int i=0; i<price.length; i++){
            afterTax[i] = Math.round(price[i]*13)/100.0;
        }
        System.out.println("The prices after tax are: <after tax prices>");
        System.out.print(Arrays.toString(afterTax));
    }
}
