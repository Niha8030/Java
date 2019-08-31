import java.util.*;
class student
{
 public String usn;
 public String name;
 public int credits[]=new int[10];
 public int marks[]=new int[10];
 public int grade_pt[]=new int[10];
 public int n;
 public  void accept_details()
 {
     Scanner s = new Scanner(System.in); 
   System.out.println("Enter name of student");
   int i;
    name=s.nextLine();
    System.out.println("Enter usn of student");
    usn=s.nextLine();
  System.out.println("enter no of subjects in current semester");
  n=s.nextInt();
  System.out.println("enter marks obtained in subjects");
   for(i=0;i<n;i++)
   {
    marks[i]=s.nextInt();
   }
  System.out.println("enter credits obtained in subjects");
  for(i=0;i<n;i++)
  {
   credits[i]=s.nextInt();
  }
  
 for(i=0;i<n;i++)
 {
  if(marks[i]>=90)
    {
    grade_pt[i]=10;
    }
  else if(marks[i]>=80 && marks[i]<90)
    {
    grade_pt[i]=9;
    }
  else if(marks[i]>=70 && marks[i]<80)
    {
    grade_pt[i]=8;
    }
   else if(marks[i]>=60 && marks[i]<70)
    {
    grade_pt[i]=7;
    }
   else if(marks[i]>=50 && marks[i]<60)
    {
    grade_pt[i]=6;
    }
    else if(marks[i]>=40 && marks[i]<50)
    {
    grade_pt[i]=4;
    }
    else
     {
      grade_pt[i]=0;
     }
 
 }

}

public float calculate_sgpa()
{
 int i,sum=0;
 float s=0,sgpa;
  for(i=0;i<n;i++)
   {
    System.out.println(+grade_pt[i]);
    }
 for(i=0;i<n;i++)
  {
  sum=sum+credits[i];
  }
 for(i=0;i<n;i++)
 {
 s=s+(grade_pt[i]*credits[i]);
 }
 sgpa=s/sum;

 return sgpa;
}

public void display_details()
{
 System.out.println("Name :"+name);
 
  System.out.println("USN :"+usn);

 System.out.println("SGPA scored="+calculate_sgpa());
}
}

class execute
{
 public static void main(String args[])
 {
  student s1=new student();
  s1.accept_details();
  s1.display_details();
 }
}
