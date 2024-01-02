
package çift_sayi;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int value;

        System.out.println("Çift bir sayı giriniz (Program sonlanana kadar devam edecek): ");

        while (true) {
            value = scanner.nextInt();

            if (value % 2 == 0 && value % 4 == 0) {
                sum += value;
            }

            // Kullanıcı 0 girene kadar devam eder
            if (value %2==1) {
                break;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);

    }
}