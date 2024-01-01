import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int y;
        Scanner girdi=new Scanner(System.in);
        System.out.println("yıl giriniz");
        y=girdi.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println(y + " bir artık yıldır.");
        } else {
            System.out.println(y + " bir artık yıl değildir.");
        }
        girdi.close();
    }
}