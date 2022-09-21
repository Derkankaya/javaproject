package main.projeler;
import java.util.Scanner;
public class ortalama_hesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Birinci sayıyı giriniz. ");
        double sayibir = scan.nextDouble();
        System.out.println("İkinci sayiyi giriniz. ");
        double sayiiki = scan.nextDouble();
        System.out.println("Üçüncü sayıyı giriniz. ");
        double sayiuc = scan.nextDouble();
        double toplam = (sayibir + sayiiki + sayiuc);
        double ortalama = (toplam / 3);
        System.out.println("Girilen sayıların ortalaması= " + ortalama);
    }
}