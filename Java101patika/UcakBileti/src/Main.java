import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select, km,age;
        double tutar,indirim;

        System.out.print("Sadece gidiş bileti istiyorsanız 1'e, Gidiş dönüş bileti istiyorsanız 2'ye basınız: ");
        select =input.nextInt();
        if(select!=1 && select != 2){
            System.out.println("Hatalı seçim yaptınız.");
        }else {
            System.out.println("Km sayfasına yönlendiriliyorsunuz...");
            System.out.print("Km miktarını giriniz:");
            km = input.nextInt();
            if (km<=0){
                System.out.println("Geçerli bir km miktarı giriniz.");
            }
            else {
                System.out.println("Yaşınızı giriniz.");
                age = input.nextInt();
                if(age<0){
                    System.out.println("Hatalı yaş girdiniz.");
                }else {
                    tutar = km*0.10;
                    if (age<12){
                        indirim=tutar*0.5;
                        tutar=tutar-indirim;
                        if (select==2){
                            indirim = tutar*0.20;
                            tutar=tutar-indirim;
                            System.out.println("Bilet Fiyatı:"+tutar);
                        }
                        else {
                            System.out.println("Bilet Fiyatı:"+tutar);
                        }
                    } else if (age>12 && age<24) {
                        indirim=tutar*0.10;
                        tutar=tutar-indirim;
                        if (select==2){
                            indirim = tutar*0.20;
                            tutar=tutar-indirim;
                            System.out.println("Bilet Fiyatı:"+tutar);
                        }
                        else {
                            System.out.println("Bilet Fiyatı:"+tutar);
                        }
                    } else if (age>=65) {
                        indirim = tutar*0.30;
                        tutar=tutar-indirim;
                        if (select==2){
                            indirim = tutar*0.20;
                            tutar=tutar-indirim;
                            System.out.println("Bilet Fiyatı:"+tutar);
                        }
                        else {
                            System.out.println("Bilet Fiyatı:"+tutar);
                        }
                    }
                    else{
                        if (select==2){
                            indirim = tutar*0.20;
                            tutar=tutar-indirim;
                            System.out.println("Bilet Fiyatı:"+tutar);
                        }
                        else {
                            System.out.println("Bilet Fiyatı:"+tutar);
                        }
                    }

                }
            }

        }





















    }
}