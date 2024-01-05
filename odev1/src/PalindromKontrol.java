import java.util.Scanner;

public class PalindromKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kelimeyi al
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        // Palindrom kontrolü
        if (palindromKontrol(kelime)) {
            System.out.println("Girilen kelime palindromiktir.");
        } else {
            System.out.println("Girilen kelime palindromik değildir.");
        }
    }

    // Palindrom kontrolü için fonksiyon
    public static boolean palindromKontrol(String kelime) {
        kelime = kelime.toLowerCase(); // Büyük-küçük harf duyarlılığını önlemek için küçük harfe çevir

        // Kelimenin başından ve sonundan birbirine doğru ilerleyen indislerle kontrol et
        int baslangic = 0;
        int bitis = kelime.length() - 1;

        while (baslangic < bitis) {
            // Harfleri karşılaştır, eğer farklıysa false döndür
            if (kelime.charAt(baslangic) != kelime.charAt(bitis)) {
                return false;
            }

            // İndisleri güncelle
            baslangic++;
            bitis--;
        }

        // İndisler birbirine eşit veya birbirine eşit olacak şekilde geçmişse kelime palindromiktir
        return true;
    }
}
