import java.util.*;
import java.lang.Math;

class bank
{
 public String cust_name;
 public String acc_no;
 public String acc_type;
 public String withdraw_type;
 public double balance;
 public double withdraw;
  public double t;
  public double n;
  public void accept()
 {
   Scanner s=new Scanner(System.in);
  System.out.println("Enter Name");
  cust_name=s.nextLine();
  System.out.println("Enter Account no ");
  acc_no=s.nextLine();
  System.out.println("Enter Account type, enter savings acc for savings account,enter current for current account ");
  acc_type=s.nextLine();
  System.out.println("Enter Balance");
  balance=s.nextDouble();
  System.out.println("Enter Withdrawal amount");
  withdraw=s.nextDouble();
 }
 
}
  class saving extends bank
  {
   public double ci;
   public void compund(bank b)
   {
    double r=0.05;
   double temp,x;
    temp=(1+(r/b.n));
     x=Math.pow(temp,(b.t*b.n));
   ci=b.balance*x;
   }
   public void accept_sav(bank b)
     {
   
       Scanner s=new Scanner(System.in);
      System.out.println("Enter time");
         b.t=s.nextDouble();
      System.out.println("Enter no of times compounded");
         b.n=s.nextDouble();
     }
      
     public void display_sav(bank b)
      {
       System.out.println("Name :"+b.cust_name);
       System.out.println("Account no :"+b.acc_no);
       System.out.println("Account type :"+b.acc_type);
System.out.println("Since savings account only cash withdrawal possible cheque book not available.Amount of cash you want to withdraw ="+b.withdraw);
       System.out.println("Balance :" +(b.balance-b.withdraw));
       compund(b);
       System.out.print("Intrest = "+ci);
   }
  }

class current extends bank
{
 public int fine;
 current()
 {
  fine=100;
 }
 
 public void display_current(bank b)
      {
        double a;
       System.out.println("Name :"+b.cust_name);
  System.out.println("Account no :"+b.acc_no);
  System.out.println("Account type :"+b.acc_type);
    System.out.println("Since current account cash withdrawal possible and cheque book u want to withdraw ="+b.withdraw);
    a=b.balance-b.withdraw;
     if(a>500)
     System.out.println("Balance :" +a);
     else
     System.out.println("Your balance is less than minimum amount hence a fine of 100 is levied :" +(a+100));

   }
  }


    class bank_execute
    {
    public static void main(String args[])
     {
       bank b1=new bank();
       saving s1= new saving();
       current c1= new current();
        b1.accept();
       int l1=b1.acc_type.length();
       int l2=7;
        if(l1==l2)
        {
         c1.display_current(b1);
      }
       else
       {
          s1.accept_sav(b1);
          s1.display_sav(b1);
       }
     }
    }
