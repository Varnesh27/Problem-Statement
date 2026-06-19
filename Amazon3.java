3. Suspicious Login Attempt Detection
Problem Statement
Amazon’s security system tracks login attempts made by users. If the same user ID attempts
to log in more than 3 times consecutively, the account is flagged as suspicious for security
review. Given a sequence of login attempts, determine whether any suspicious activity
exists.

import java.util.Scanner;
import java.util.Arrays;
public class Amazon{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        scan.nextLine();
        String [] user=new String[i];
        for(int j=0;j<i;j++){
            user[j]=scan.nextLine();
        }
        int count=0;
        for(int j=0;j<i-1;j++){
            if(user[j].equals(user[j+1])){
                count++;
            }
            else{
                count=0;
            }
            if(count==2){
                System.out.println("Alert");
                break;
            }
        }
        scan.close();
    }
}

