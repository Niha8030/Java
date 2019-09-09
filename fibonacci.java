import java.util.*;

class fibonacci
{
 public static void main(String args[])
 {
  int num1,num2,num3,n,i;
  Scanner s=new Scanner(System.in);
  num1=0;
  num2=1;
  System.out.println("enter n upto which fibonacci has to be printed");
  n=s.nextInt();
  System.out.println(num1);
  System.out.println(num2);
  for(i=0;i<n;i++)
  {
   num3=num1+num2;
   System.out.println(num3);
   num1=num2;
   num2=num3;
   }
 } 
} 