
package dortbeskuvvet;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.println("4 ve 5'in kuvvetleri:");

        for (int i = 1; i <= n; i*=4){
           System.out.println(i);

        }
        for (int i=0;i<=n; i*=5){
            System.out.println(i);
        }

    }
}