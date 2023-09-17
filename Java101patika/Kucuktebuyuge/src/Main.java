import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int a,b,c;
       int buyuk=0,ortanca=0,kucuk=0;


        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı yazınız:");
        a = input.nextInt();
        System.out.print("İlk sayıyı yazınız:");
        b = input.nextInt();
        System.out.print("İlk sayıyı yazınız:");
        c = input.nextInt();

        if ((a>b) && (a>c)){
            buyuk = a;
            if (b>c) {
                ortanca = b;
                kucuk=c;
            }else {
                ortanca=c;
                kucuk=b;
            }
        } else if((b>a) && (b>c)){
            buyuk = b;
            if (a>c){
                ortanca=a;
                kucuk=c;
            }else {
                ortanca=c;
                kucuk=a;
            }
        } else if ((c>b) && (c>a)) {
            buyuk=c;
            if (b>a){
                ortanca=b;
                kucuk=a;
            }else {
                ortanca=a;
                kucuk =b;
            }
        }else{
            System.out.println("lütfen eşit sayılar girmeyiniz.");
        }

        System.out.print("Büyük sayı:"+buyuk+"\nOrtanca sayı:"+ortanca+"\nKücük sayı:"+kucuk);
    }
}