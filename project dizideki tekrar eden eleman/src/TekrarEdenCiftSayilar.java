import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı dizisini al
        System.out.print("Sayı dizisini girin (virgülle ayırarak): ");
        String[] sayilar = scanner.nextLine().split(",");

        // Map kullanarak sayıların tekrar sayılarını tut
        Map<Integer, Integer> sayiTekrarlari = new HashMap<>();

        // Sayıları işle ve tekrar sayılarını hesapla
        for (String sayiStr : sayilar) {
            int sayi = Integer.parseInt(sayiStr);

            // Çift sayıları kontrol et
            if (sayi % 2 == 0) {
                // Map'te sayının tekrar sayısını güncelle
                sayiTekrarlari.put(sayi, sayiTekrarlari.getOrDefault(sayi, 0) + 1);
            }
        }

        // Tekrar eden çift sayıları ekrana yazdır
        System.out.println("Tekrar eden çift sayılar:");
        for (Map.Entry<Integer, Integer> entry : sayiTekrarlari.entrySet()) {
            int sayi = entry.getKey();
            int tekrarSayisi = entry.getValue();

            if (tekrarSayisi > 1) {
                System.out.println(sayi + " (Tekrar Sayısı: " + tekrarSayisi + ")");
            }
        }
    }
}
