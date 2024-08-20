
package user;
import javax.swing.JOptionPane;

import java.util.Scanner;

public class USER {

    public static void main(String[] args) {
        String Zoro;

Zoro = JOptionPane.showInputDialog(null, "ENTER STUDENT NUMBER ");
JOptionPane.showMessageDialog(null, "Hello USER "+Zoro+"!");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter PIN:");
   
        
       int  Number = input.nextInt();
        
        if(Number >=0){
            System.out.println("GRAND ACCESS");
        }else if(Number<0){
        System.out.println("WRONG PIN OR USERNAME ENTERED,PLEASE TRY AGAIN!");
        }else{
        System.out.println("YOU ARE MAD");
        }

    }
    
}
