1.Prime Delivery Charge Calculator
Problem Statement
Amazon is testing a new delivery billing system. Every customer places an order with a
purchase amount. If the amount is above ₹2000, the customer gets free delivery. Otherwise,
a delivery fee of ₹150 is added. If the customer is a Prime member, the delivery fee is
reduced by 50%. Given the purchase amount and Prime membership status, determine the
final amount payable by the customer.

import java.util.Scanner;
public class Amazon{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        String prime=scan.nextLine();
        int amount=scan.nextInt();
        if(amount>2000){
            System.out.println(amount);
        }
        else
        {
            if(prime.equals("yes"))
            {
                System.out.println(amount+75);
            }
            else{
                System.out.println(amount+150);
            }
        }
      //  Scanner.close();
    }
}

