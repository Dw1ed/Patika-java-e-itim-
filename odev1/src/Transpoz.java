import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris boyutlarını kullanıcıdan al
        System.out.print("Matrisin satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int sutunSayisi = scanner.nextInt();

        // Matrisi kullanıcıdan al
        int[][] matris = new int[satirSayisi][sutunSayisi];
        System.out.println("Matris elemanlarını girin:");

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisi oluştur
        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        // Matrisin transpozunu al
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        // Transpoz matrisi ekrana yazdır
        System.out.println("Matrisin Transpozu:");

        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                System.out.print(transpozMatris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
