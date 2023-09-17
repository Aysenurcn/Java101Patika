
public class Main {
    public static void main(String[] args) {
    int[] number ={1,2,4};
    double result=0;

        for (double item : number){
            result= 1/item + result;


        }

        System.out.println("Sonuç:"+ number.length/result);

    }
}