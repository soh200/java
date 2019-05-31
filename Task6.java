
import java.io.*;
import java.util.*;
 
public class Task6 {
    

    public static void main(String[] args) {
        
        
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Integer:");
       int n=sc.nextInt();
       if(n>0)
           System.out.println("positive number");
       else if(n<0)
                      System.out.println("negative number");
       else
                      System.out.println("it is zero");


    }
    
}
