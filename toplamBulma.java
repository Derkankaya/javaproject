package main.projeler;

public class toplamBulma {
    public static void main(String[] args) {

        double[] myList = {2.3, 5.3, 1.7, 7.1};
        double max = myList[0];
        double total = 0;
        for ( double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = "+total);
        System.out.println("En büyük sayı= "+max);

    }
}