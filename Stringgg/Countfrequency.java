package Stringgg;
import java.util.*;

public class Countfrequency {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("please input string");
        String str = s.nextLine();
        long startTime = System.nanoTime();
        fastcountfrequency(str);
        long endTime = System.nanoTime();    
        System.out.println("Time cosumed : "+(float)(endTime-startTime)/1000000+"ms");

        startTime = System.nanoTime();
        countfrequency(str);
        endTime = System.nanoTime();    
        System.out.println("Time cosumed : "+(float)(endTime-startTime)/1000000+"ms");  
        countfrequency(str);
        s.close();
    }

    public static void countfrequency(String str){
        char[] carr = str.toCharArray();
        for(char c : carr){
            int count = 0;
            for(char cc: carr){
                if(cc == c)
                count++;
            }
            //System.out.println(c+": "+count);     // Not printing to get the complexity in calulation
        }
    }
    public static void fastcountfrequency(String str){
        int[] arr = new int[256];
        char[] carr = str.toCharArray();
        for(char c :carr){
            arr[c]++;
        }
        /*for(int i = 0; i < carr.length; i++){
            System.out.println(carr[i]+": "+arr[carr[i]]);
        }*/
    }
}
