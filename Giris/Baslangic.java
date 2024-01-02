
package Giris;
import javax.swing.*;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
       int k;
       Scanner inp=new Scanner(System.in);
       System.out.println("Sayı giriniz: ");
       k=inp.nextInt();
       int i=0;
       while(i<=k){
           if(i%2==0){
               System.out.println(i);
           }
           i++;
       }



    }
}