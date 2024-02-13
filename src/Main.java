
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int N, LittleNum, sayi, sayi1, sayi2, highNum;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz : ");
        N = scanner.nextInt();
        System.out.print("1. Sayiyi giriniz : ");
        sayi1 = scanner.nextInt();
        sayi2 = sayi1;
        for(int dongu = 2; dongu <= N; dongu++){
            highNum = sayi1;
            LittleNum = sayi2;
            System.out.print(dongu + ". Sayiyi giriniz : ");
            sayi = scanner.nextInt();
            sayi1 = sayi;
            sayi2 = sayi;
            if(highNum > sayi1){
                sayi1 = highNum;
            }
            if(LittleNum < sayi2){
                sayi2 = LittleNum;
            }
        }
        System.out.println("En buyuk sayi : " + sayi1);
        System.out.println("En kucuk sayi : " + sayi2);
    }
}
