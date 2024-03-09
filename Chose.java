
package mobile_banking_system;


import java.util.Scanner;

import java.util.Scanner;

class Chose extends MainClass {
    Scanner select = new Scanner(System.in);
    
    
      void SendMoney(){
      System.out.print("Enter Receiver bKash Account NO: ");  
      long number = select.nextLong();
      NumberCheck obj = new NumberCheck(number,1);    
    }
                  void Payment(){
      System.out.print("Enter Receiver bKash Account NO: ");  
      long number = select.nextLong();
      NumberCheck obj = new NumberCheck(number,5);    
    }
      
      
     void MobileRechare(){
        System.out.println("\n1. Robi\n2. Airtel\n3. Bangalink\n4. GrameenPhone\n5. Teletalk");
        System.out.print("==>: ");
        int n = select.nextInt();
        switch(n) {
        case 01: {
          System.out.print("Enter Robi Mobile NO: ");
          long robi = select.nextInt();
          if(robi>=1800000000&&robi<=1899999999) {
            Rechargeamount("Robi", robi);
          }
          else
            System.out.println("The Robi Mobile NO. is invalid!");
          break;
        }
        case 02:{
          System.out.print("Enter Airtel Mobile No: ");
          long airtel = select.nextInt();
          if(airtel>=1600000000&&airtel<=1699999999) {
            Rechargeamount("airtel", airtel);
          }
          else
            System.out.println("The Airtel Mobile NO. is invalid!");
          break;
        }
        case 03:{
          System.out.print("Enter Bangalink Mobile No: ");
          long banglalink = select.nextInt();
          if(banglalink>=1900000000&&banglalink<=1999999999) {
            Rechargeamount("Banglalink", banglalink);
          }
          else
            System.out.println("The Banglalink Mobile NO. is invalid!");
          break;
        }
        case 04:{
          System.out.print("Enter GrameenPhone Mobile No: ");
          long grameenphone = select.nextInt();
          if(grameenphone>=1700000000&&grameenphone<=1799999999) {
            Rechargeamount("GrameenPhone", grameenphone);
          }
          else
            System.out.println("The GrameenPhone Mobile NO. is invalid!");
          break;
        }
        case 05:{
          System.out.print("Enter Teletalk Mobile No: ");
          long teletalk = select.nextInt();
          if(teletalk>=1500000000&&teletalk<=1599999999) {
            Rechargeamount("Teletalk", teletalk);
          }
          else
            System.out.println("The Teletalk Mobile NO. is invalid!");
          break;
        }
        }
      }
     void Rechargeamount(String sim ,long number) {
       System.out.print("Enter Recharge Amount: ");
       long amount = select.nextLong();
       if(Balence>amount) {
         System.out.print("\nMobile Recharge\nTo: 0"+number+"\nAmount: Tk "+amount+"\nEnter Menu PIN to Confirm: ");
         int Npin = select.nextInt();
         if(Npin==pin) {
           Balence= Balence-amount;
           System.out.println("\nYour bKash Mobile Recharge request of\nTk "+amount+".00 for 0"+number+" was successful");
         }
       }
       else
         System.out.println("Insufficient funds!");
     }


void CashOut() {
       System.out.print("Cash out charge 1.85%\nEnter bKash Agent No: ");
       long number = select.nextLong();
       NumberCheck obj = new NumberCheck(number,3);
     }
void MybKash(){
  System.out.println("1. Cheek Balance\n2. Change Pin");
  System.out.print("==>: ");
  int n = select.nextInt();
  switch(n) {
  case 01:{
    System.out.print("Enter Menu Pin: ");
    int npin= select.nextInt();
    if(npin==pin) {
      System.out.println("\nYour current bKash Account\nbalance is Tk "+Balence);
    }
    else
      System.out.println("Pin Number is Wrong");
    break;
  }
  case 02:{
     System.out.print("Enter Old Pin: ");
     int oldpin=select.nextInt();
     if(oldpin==pin){
       System.out.print("Enter New pin: ");
       int newpin = select.nextInt();
       pin = newpin;
       System.out.println("Your Pin Changed successfully.");
     }
     else 
       System.out.println("Your Old pin is wrong!");
    break;
  }
  }
}
}
     
