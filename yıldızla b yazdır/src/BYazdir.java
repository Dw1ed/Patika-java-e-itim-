public class BYazdir {
    public static void main(String[] args) {
        // Boyutları belirlenen bir matris oluşturun
        int satir = 7;
        int sutun = 5;
        char[][] matris = new char[satir][sutun];

        // Matrisi '*' ile doldurun
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = '*';
            }
        }

        // "B" harfini oluşturun
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                // Sol dikey çubuk
                if (j == 0 || j == sutun - 1) {
                    matris[i][j] = '*';
                }
                // Üst yatay çubuk
                else if (i == 0) {
                    matris[i][j] = '*';
                }
                // Alt yatay çubuk
                else if (i == satir - 1) {
                    matris[i][j] = '*';
                }
                // Sağ dikey çubuk
                else if (j == sutun / 2 && i <= satir / 2) {
                    matris[i][j] = '*';
                }
            }
        }

        // Matrisi ekrana yazdır
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
