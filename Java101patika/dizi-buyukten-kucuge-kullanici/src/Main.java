import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu giriniz:");
    int diziNumber = input.nextInt();
    int number;
    int[]list=new int[diziNumber];

    for (int i=0; i<diziNumber; i++){
         number = input.nextInt();
         list[i]=number;
    }

        System.out.println("Dizi : "+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralı: "+Arrays.toString(list));



    }
}
