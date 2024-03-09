
package mobile_banking_system;


import java.util.Scanner;
import javax.swing.SwingUtilities;
import mobile_banking_system.DialPadGUI.DialPadListener;

public class MainClass {
  double Balence = 10000;
  int pin = 12345;
public static void main(String[]args) {
    DialPadListener listener;
        listener = (String number) -> {
            //System.out.println("String dialed in the main class: " + number);
            
   if (number.equals("*247#")) { 
        System.out.println("bKash");
  System.out.println("1 Send Money");
  System.out.println("2 Mobile Recharge");
  System.out.println("3 Cash Out");
  System.out.println("4 My bKash");
        System.out.println("5 Payment");
        System.out.println("6 Pay Bill");
        System.out.println("7 Microfinace");
        System.out.println("8 Download bKash App");
        System.out.println("9 Send Money to Non-bKash User");
        System.out.println("10 Reset PIN");
  System.out.print("==>: ");
  Scanner select = new Scanner(System.in);
  int n = select.nextInt();
  Chose call = new Chose();
  switch(n) 
  {
  case 01 ->   {
    call.SendMoney();
  }
  case 02 ->   {
    call.MobileRechare();
  }
  case 03 ->   {
    call.CashOut();
  }
  case 04 -> {
    call.MybKash();
  }
        case 05 -> {
    call.Payment();
  }
  }
               
            }
            else{
                System.out.println("Invalid try again");
            }
        };
        
        SwingUtilities.invokeLater(() -> {
            DialPadGUI dialPad = new DialPadGUI(listener);
            dialPad.setVisible(true);
        });      
}
}

