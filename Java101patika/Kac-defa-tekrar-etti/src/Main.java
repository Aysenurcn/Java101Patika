import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // dizinin boyutu belirlenmeli
        System.out.print("DIZININ BOYUTU:");
        int n=input.nextInt();

        int[]arr = new int[n];
        System.out.println("DIZININ ELEMANLARINI GIRINIZ:");

        for (int i=0;i<n;i++){
            System.out.print((i+1)+".ELEMAN:");
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);

        int sayac=1;

        for(int i=0; i< arr.length; i++) {

            if(i==0) {
                for( int j=0; j<arr.length; j++) {
                    if ((i != j) && arr[i] == arr[j]) {

                        sayac++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + sayac + " kere tekrar etmiştir.");
            }else if (arr[i] != arr[i-1]) {
                for (int j=0; j< arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j])) {
                        sayac++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + sayac + " kere tekrar etmiştir.");
            }
            sayac=1;
        }




    }
}