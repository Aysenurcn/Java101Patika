import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number;
       int total=0;

        System.out.print("Sayı giriniz:");

        do {
            number = input.nextInt();
            if (number%4==0){
                total=number+total; System.out.print("Sayı giriniz:");

            }
            else {
                System.out.println("Tek sayı girdiniz.\n"+"Total:"+total);
                break;
            }
        }
        while (number > 0);
    }
}