package main.projeler;

public class asalSayiMi {
    public static void main(String[] args) {
        int number = 23;
        int remainder = number % 2;
        boolean isPrime = true;
         if (number == 1){
             System.out.println("Sayı asal değildir.");
         }
         if (number < 1){
             System.out.println("Geçersiz bir sayı girdiniz.");
         }
         for (int i = 2; i<number; i++ ){
             if (number % i == 0){
                 isPrime=false;
             }
        }
         if (isPrime){
             System.out.println("Sayı asaldır.");
         }else{
             System.out.println("Sayı asal değildir.");
         }
    }
}
