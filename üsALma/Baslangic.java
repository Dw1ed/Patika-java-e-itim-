
package üsALma;
import java.util.Scanner;
public class Baslangic {
    // METOT
    static int power(int base, int power)
    {
        if (power != 0)
        {
            return base * power(base, power - 1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        int base, power;
        System.out.println("---------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısı giriniz: ");
        base = input.nextInt();

        System.out.print("Üs sayısı giriniz: ");
        power = input.nextInt();
        System.out.println("---------------------------");

        System.out.println("Sonuç: " + power(base, power));

    }
}