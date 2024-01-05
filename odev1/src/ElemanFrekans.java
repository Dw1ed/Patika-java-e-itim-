import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElemanFrekans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Diziyi kullanıcıdan al
        System.out.print("Diziyi girin (virgülle ayırarak): ");
        String[] elemanlar = scanner.nextLine().split(",");

        // Map kullanarak eleman frekanslarını tut
        Map<String, Integer> elemanFrekanslari = new HashMap<>();

        // Elemanları işle ve frekanslarını hesapla
        for (String eleman : elemanlar) {
            // Map'te elemanın frekansını güncelle
            elemanFrekanslari.put(eleman, elemanFrekanslari.getOrDefault(eleman, 0) + 1);
        }

        // Eleman frekanslarını ekrana yazdır
        System.out.println("Eleman frekansları:");
        for (Map.Entry<String, Integer> entry : elemanFrekanslari.entrySet()) {
            String eleman = entry.getKey();
            int frekans = entry.getValue();

            System.out.println(eleman + ": " + frekans + " kez");
        }
    }
}
