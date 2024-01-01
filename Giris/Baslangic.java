
package Giris;
import javax.swing.*;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
        int km,y;
      int yolculukTipi;
        Scanner girdi=new Scanner(System.in);
        System.out.println("Mesafeyi giriniz");
        km=girdi.nextInt();
        System.out.println("Yaşınızı giriniz");
        y=girdi.nextInt();
        System.out.println("yolculuk tipini giriniz 1/2");
        yolculukTipi=girdi.nextInt();
        //Geçerli veri kontrolü
        if (km <= 0 || y <= 0 ) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        double ucret = km * 0.10;
        if (y < 12) {
            ucret *= 0.5; // 50% indirim
        } else if (y >= 12 && y <= 24) {
            ucret *= 0.9; // 10% indirim
        } else if (y >= 65) {
            ucret *= 0.7; // 30% indirim
        }
        if (yolculukTipi==2) {
            ucret *= 0.8; // 20% indirim
        }

        System.out.println("Toplam Bilet Fiyatı: " + ucret + " TL");

    }
}