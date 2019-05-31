import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Task10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of terms :");
        int n=sc.nextInt();
        int p;
        
        for(int i=0;i<n;i++)
        {
            p=(int)Math.pow((i+1),3)
            System.out.print("\nNumber is : "+(i+1)+"and cube of "+(i+1)+" is :"+p);
            
        }
        
       
    }
    
}
