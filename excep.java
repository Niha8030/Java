import java.util.*;

class WrongAge extends Exception
{
 int i;
 public WrongAge(int x)
 {
  i=x;
 }
 public String toString()
 {
  return "["+i+"] AGE MISSMATCH!!";
 }
}
 
    


class father
{
 public int agef;
 father(int a)throws WrongAge
 {
  agef=a;
  if(agef<=0)
   throw new WrongAge(agef);
 }
}

class son extends father
{
 public int ages;
 son(int b)throws WrongAge
 {
   ages=b;
   if(ages==agef)
     throw new WrongAge(ages);
   else
    System.out.println("Ages of FATHER and his SON are recorded.........\nFather : "+agef+"yrs\nSon : "+ages+"yrs");
  }
 }

class exp
{

 public static void main(String args[])
 {
  int m;
  int n;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the age of Father : ");
  m=s.nextInt();
  System.out.println("Enter the age of his Son : ");
  n=s.nextInt();
  try
  {
   father o1=new father(m);
   son o2=new son(n);
  }
  catch(WrongAge e)
  {
   System.out.println("e");
  }
 }
}
