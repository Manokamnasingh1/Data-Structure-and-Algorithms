
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int number[]= new int[size];
        System.out.println("enter element of an array");
        //input
        for(int i=0;i<size;i++){

            number[i] = sc.nextInt();
        }
//output
        for(int i=0;i<size;i++){
            System.out.println(number[i]);
        }


    }
}
