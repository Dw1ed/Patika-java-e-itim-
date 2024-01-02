
package palindrom;

public class Baslangic {
    static boolean isPalindrom(int number){
        int tmp=number , reverseNum=0 ,lastNumber;
        while(tmp !=0){
            lastNumber=tmp%10;
            reverseNum=(reverseNum*10)+lastNumber;
            tmp/=10;
        }
        if (number==reverseNum) {
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(233));

    }
}
