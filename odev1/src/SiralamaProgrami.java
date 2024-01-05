import java.util.Arrays;
import java.util.Scanner;

public class SiralamaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Diziyi oluştur ve elemanları kullanıcıdan al
        int[] dizi = new int[boyut];
        System.out.print("Dizinin elemanlarını girin (virgülle ayırarak): ");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        // Sıralanmış diziyi ekrana yazdır
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali:");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}
