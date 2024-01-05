import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 0 ile 100 arasında rastgele bir sayı seç
        int secilenSayi = random.nextInt(101); // 0 dahil, 101 hariç

        System.out.println("0 ile 100 arasında bir sayı seçildi. Tahmininizi girin.");

        int tahmin;
        int tahminSayisi = 0;

        do {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin < secilenSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > secilenSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                System.out.println("Tahmin sayısı: " + tahminSayisi);
            }

        } while (tahmin != secilenSayi);

