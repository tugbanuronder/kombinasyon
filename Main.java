import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, r, total1 = 1, total2 = 1, total3 = 1, i, k, z;
        double C;

        System.out.print("N degeri giriniz:");
        n = input.nextInt();
        System.out.print("r degeri giriniz:");
        r = input.nextInt();

        if (n < 0 || r < 0) {
            System.out.println("Negatif sayıların faktöriyeli yoktur. Tekrar deneyiniz.");
        } else {

            for (i = 1; i <= n; i++) {
                total1 *= i;
            }
            for (k = 1; k <= r; k++) {
                total2 *= k;
            }
            for (z = 1; z <= n - r; z++) {
                total3 *= z;
            }

            C = total1 / ((total2 * total3));

            System.out.println("C" + "(" + n + "," + r + ")" + "kombinasyonu " + C + "'dir.");

        }
    }

}