package main.projeler;
import java.util.Scanner;

public class unlu_unsuzHarf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String harf =scan.next();
        switch (harf) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "I":
            case "i":
            case "O":
            case "o":
            case "U":
            case "u":


                System.out.println("Ünlü harftir.");
                break;
            default:
                System.out.println("Ünsüz sesli harftir.");

        }

    }
}
