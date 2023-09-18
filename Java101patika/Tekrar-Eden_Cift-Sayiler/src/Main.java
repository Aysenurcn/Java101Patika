import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static boolean isFind(int arr[], int value)
    {
        for(int i: arr)
        {
            if (i == value){
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        int[] list ={1, 2, 42, 2, 57, 100, 57, 42, 23, 100};
        int dublicate[]= new int[list.length];
        int startIndex = 0;

        for (int i=0; i < list.length; i++){

            for (int j=0;j<list.length;j++){

                if ((j!=i) && (list[i]==list[j]))
                {
                    if(!isFind(dublicate,list[i]))
                    {
                        if (list[i]%2==0) {
                            dublicate[startIndex++] = list[i];
                        }
                    }
                    break;
                }
            }
        }

        for(int value : dublicate){
            if (value!= 0){
                System.out.println(value);
            }

        }


    }
}