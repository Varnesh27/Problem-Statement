2. Warehouse Box Arrangement
Problem Statement
Amazon warehouses receive thousands of products daily. To optimize space, products are
packed into large storage boxes. Each box can hold exactly K products. If some products
remain, an extra box must be allocated. Given the total number of products arriving in a
shipment and the capacity of each box, determine how many boxes are required.

import java.util.Scanner;
public class Amazon{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int tot=scan.nextInt();
        int cap=scan.nextInt();
        System.out.println(tot/cap);
      //  Scanner.close();
    }
}

