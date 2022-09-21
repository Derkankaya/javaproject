package main.projeler;
        import java.util.Scanner;
public class vizeFinal_hesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("vize notunuzu giriniz. ");
        int vize = scan.nextInt();
        System.out.println("final notunuzu giriniz. ");
        int fnal = scan.nextInt();
        int vizeort = (vize*40/100);
        int fnalort = (fnal*60/100);
        int ortalamasi = (vizeort+fnalort);
        if (ortalamasi<50.0){
            System.out.println("Vize ve final notunuzun ortalaması: "+ortalamasi+". Dersi geçemediniz.");
        }else{
            System.out.println("Vize ve final notunuzun ortalaması: "+ortalamasi+" Tebrikler dersi geçtiniz!");
        }

    }
}

