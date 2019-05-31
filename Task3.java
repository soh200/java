import java.io.*;
import java.util.*;
public class Task3 
{

  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       System.out.print("enter the number ");
       int n=sc.nextInt();
       int d,s=0;
       while(n!=0)
       {
           d=n%10;
           n=n/10;
           s=s+d;
       }
       System.out.println("the sum of the digits:"+s);
    }
    
}
