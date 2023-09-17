import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

       Scanner input = new Scanner(System.in);

        System.out.println("Sayı giriniz:");
        number = input.nextInt();

        for (int i = 0; i<=number; i++){
            if ((i%3==0)&&(i%4==0)){
                System.out.print(i + " ");
            }
        }
    }
}