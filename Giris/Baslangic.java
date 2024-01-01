
package Giris;
import javax.swing.*;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
        int dg;
        Scanner girdi=new Scanner(System.in);
        System.out.println("Doğrum yılınızı giriniz");
        dg=girdi.nextInt();
        switch (dg){
            case 0:
                    System.out.println("Çin Zodyağınız Maymundur");
                    break;
            case 1:
                System.out.println("Çin Zodyağınız Horozdur");
                break;
            case 2:
                System.out.println("Çin Zodyağınız Köpektir");
                break;
            case 3:
                System.out.println("Çin Zodyağınız Köpektir");
                break;
            case 4:
                System.out.println("Çin Zodyağınız Faredir");
                break;
            case 5:
                System.out.println("Çin Zodyağınız Öküzdür");
                break;
            case 6:
                System.out.println("Çin Zodyağınız Kaplandır");
                break;
            case 7:
                System.out.println("Çin Zodyağınız Tavşandır");
                break;
            case 8:
                System.out.println("Çin Zodyağınız Ejderhadır");
                break;
            case 9:
                System.out.println("Çin Zodyağınız Yılandır");
                break;
            case 10:
                System.out.println("Çin Zodyağınız Atdır");
                break;
            case 11:
                System.out.println("Çin Zodyağınız Koyundur");
                break;
        }
    }
}