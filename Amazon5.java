5. Inventory Threshold Alert
Problem Statement
Amazon’s warehouse management system constantly monitors stock levels. Each product
has a minimum threshold value. If the current stock of a product falls below the threshold,
the system must immediately trigger a restocking alert Given the current stock and
threshold, determine whether restocking is required.


import java.util.Scanner;
import java.util.Arrays;
public class Amazon{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int threshold=scan.nextInt();
        int [] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
            if(a[i]<threshold){
                System.out.println("ALert");
                break;
            }
        }
    }
}



