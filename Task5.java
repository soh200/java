import java.io.*;
import java.util.*;


public class Task5 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the minutes :");
        long m=sc.nextLong();
        long d=m/1440;
        long y=d/365;
        d=d-(365*y);
        System.out.println("no of years:"+y+" no of dayd:"+d);
        
    }
    
}
