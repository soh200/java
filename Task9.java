import java.io.*;
import java.util.*;
public class Task9 {
    int smallestnum(int a,int b,int c)
    {
        if(a<=b && a<=c)
            return a;
        else if(b<=a && b<=c)
            return b;
        else return c;
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Task8 t=new Task8();
        System.out.print("smallest number "+t.smallestnum(a,b,c));
        
      
    }
    
}
