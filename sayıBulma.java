package main.projeler;
import java.util.Scanner;
public class sayıBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sayilar = new int[]{2,3,5,7,9,323,8573,393,123,111,9319};
        System.out.println("Bir sayı giriniz.");
        int aracakSayi = scan.nextInt();
        boolean varMi = false;

                for(int sayi : sayilar) {
                    if (sayi == aracakSayi) {
                        varMi = true;
                        break;
                    }
                }
                if(varMi){
                    System.out.println("Sayı mevcuttur.");
                }else {
                    System.out.println("Sayı mevcut değildir.");
                }

    }
}
