import java.util.*;
import java.lang.Math.*;

class roots
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the value of a=");
  double a=s.nextDouble();
  System.out.println("enter the value of b="); 
  double b=s.nextDouble();
  System.out.println("enter the value of c=");
  double c=s.nextDouble();
  double D,r1,r2;
  D=(b*b)-(4*a*c);
  if(D>0)
  {
   r1=(-b+Math.sqrt(D))/(2*a);
   r2=(-b-Math.sqrt(D))/(2*a);
   System.out.println("Roots are real and unequal");
   System.out.println("root 1="+r1);
   System.out.println("root 2="+r2);
   }
  else if(D==0)
  {
   r1=r2=(-b/(2*a));
   System.out.println("Roots are real and equal");
   System.out.println("root 1="+r1);
   System.out.println("root 2="+r2);
   }
  else
  {
   System.out.println("roots are imaginary");
   }
 }
}
   
   