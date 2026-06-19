4. Delivery Partner Performance Check
Problem Statement
Amazon evaluates its delivery partners daily. Each partner’s delivery time (in minutes) is
recorded. The management wants to identify the fastest delivery completed in a day. Given
the delivery times of all partners, determine the minimum delivery time.


import java.util.Scanner;
import java.util.Arrays;
public class Amazon{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int [] a=new int[size];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
            min=Math.min(min,a[i]);
        }
        System.out.println(min);
    }
}

