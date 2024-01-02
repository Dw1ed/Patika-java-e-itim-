
package desen;
import java.util.Scanner;
public class Baslangic {
    // Metot Design
    // control ile girilen sayı kontrol edilir.
    // num >0 olacağı için değeri true'dur.
    //int n, boolean dNoktasi, int sayac
    static int design(int n, boolean control, int flag) {
        if (control) {
            if (n > 0) {
                System.out.print(n + " ");
                flag++;
                return design(n - 5, true, flag);
            } else {
                return design(n, false, flag);
            }
        } else {
            System.out.print(n + " ");
            if (flag > 0) {
                flag--;

                return design(n + 5, false, flag);
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        //flag sayac değişkeni, 0'dan başlamalı
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Recursive Desene Göre Metot Oluşturma");
        System.out.println("--------------------------------------");
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        System.out.println("---------------------------------------");
        System.out.println(design(n, true, 0));
        System.out.println("---------------------------------------");
    }
}