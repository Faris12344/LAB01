
package javaapplication1;

import java.time.LocalDate;

/**
 *
 * @author 1935595
 */
public class App {

    public static void main(String[] args) {
//َQ4
        Product p1 = new ElectricProduct(4875, 30.0, "Extension cord", "110v");
        Product p2 = new ElectricProduct(4876, 31.0, "Extension cord", "220v");
        Product p3 = new ElectricProduct(4877, 32.0, "Extension cord", "110v");
        Product p4 = new ElectricProduct(4878, 33.0, "Extension cord", "220v");
        Product[] product = {p1, p2, p3, p4};

        for (Product p : product) {
            p.applySaleDiscount(20);
            System.out.println(p.toString());
        }
    }
}
