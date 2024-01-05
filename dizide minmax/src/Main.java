import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayilar {
    public static void main(String[] args) {


        int[] dizi={7,8,9,10,11,12,13};
        int hedefSayi=5;

        // En yakın küçük ve büyük sayıları bulalım
        int enYakinKucuk = Integer.MIN_VALUE;
        int enYakinBuyuk = Integer.MAX_VALUE;

        for (int sayi : dizi) {
            if (sayi < hedefSayi && sayi > enYakinKucuk) {
                enYakinKucuk = sayi;
            }
            if (sayi > hedefSayi && sayi < enYakinBuyuk) {
                enYakinBuyuk = sayi;
            }
        }

        // Sonuçları yazdıralım
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (enYakinKucuk != Integer.MIN_VALUE ? enYakinKucuk : "Bulunamadı"));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (enYakinBuyuk != Integer.MAX_VALUE ? enYakinBuyuk : "Bulunamadı"));
    }
}