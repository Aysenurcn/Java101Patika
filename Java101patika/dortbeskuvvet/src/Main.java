import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;

       Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = input.nextInt();
        System.out.print("4'ün katları: ");
        for (int i= 1; i<=number; i=i*4){
            System.out.print(i+" ");
        }
        System.out.print("\n5'ün katları: ");
        for (int k =1;k<=number;k=k*5)
        {
            System.out.print(k +" ");
        }

    }
}