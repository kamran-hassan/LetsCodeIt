package Arrayss;
import java.util.*;



public class two {
    public static void main(String[] args){
        System.out.println("Reverse An Array Code");
        
        System.out.println("Please give the size of array");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[] array = new Integer[n];
        for(int i=0; i<n; i++){
            System.out.println("Please enter value "+ i);
            array[i] = s.nextInt();
        }
        Arrayss.reversanarray.reversemethode1(array);

        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
}

