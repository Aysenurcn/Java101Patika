import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day;

        System.out.print("Doğduğunuz ayı giriniz:");
        month=input.nextInt();
        System.out.print("Doğdunuz günü giriniz:");
        day =input.nextInt();

        switch (month){
            case 1:
                if (day < 22 ){
                    System.out.print("Oğlak Burcusunuz !");
                }
                else {
                    System.out.println("Kova Burcusunuz !");
                }
            case 2:
                if (day<19){
                    System.out.println("Kova Burcusunuz !");
                }
                else {
                    System.out.println("Balık Burcusunuz !");
                }
            case 3:
                if (day<20){
                    System.out.println("Balık Burcusunuz !");
                }
                else {
                    System.out.println("Koç Burcusunuz !");
                }
            case 4:
                if (day<20){
                    System.out.println("Koç Burcusunuz !");
                }
                else {
                    System.out.println("Boğa Burcusunuz !");
                }
            case 5:
                if (day<21)
                    {
                        System.out.println("Boğa Burcusunuz !");
                    }else{
                        System.out.println("İkizler Burcusunuz !");
                    }
            case 6:
                if (day<23){
                    System.out.println("İkizler Burcusunuz !");
                }else {
                    System.out.println("Yengeç Burcusunuz !");
                }
            case 7:
                if (day<22){
                    System.out.println("Yengeç Burcusunuz !");
                }else {
                    System.out.println("Aslan Burcusunuz !");
                }
            case 8:
                if (day<23){
                    System.out.println("Aslan Burcusunuz !");
                }else {
                    System.out.println("Başak Burcusunuz !");
                }
            case 9:
                if (day<23){
                    System.out.println("Başak Burcusunuz !");
                }else {
                    System.out.println("Terazi Burcusunuz !");
                }
            case 10:
                if (day<23){
                    System.out.println("Terazi Burcusunuz !");
                }else {
                    System.out.println("Akrep Burcusunuz !");
                }
            case 11:
                if (day<22){
                    System.out.println("Akrep Burcusunuz !");
                }else {
                    System.out.println("Yay Burcusunuz !");
                }
            case 12:
                if (day<22){
                    System.out.println("Yay Burcusunuz !");
                }else {
                    System.out.println("Oğlak Burcusunuz !");
                }


        }
    }
}