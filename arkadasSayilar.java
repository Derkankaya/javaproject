package main.projeler;
import java.util.Scanner;
public class arkadasSayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz.");
        int s1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int s2 = scan.nextInt();
        int t1 = 0;
        int t2 = 0;

        for(int i = 1; i<s1; i++){
            if(s1%i == 0){
                t1 = t1 + i;
            }
        }
        for(int i = 1; i<s2; i++) {
            if (s2 % i == 0) {
                t2 = t2 + i;
            }
        }
        if(s1 == t2 && s2 == t1){
            System.out.println("Girilen sayılar arkadaştır.");
        }else{
            System.out.println("Girilen sayılar arkadaş değildir.");
        }

    }
}
