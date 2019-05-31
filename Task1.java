import java.util.Scanner;
 
public class task1 {
 
    public static void main(String[] args) {
 
        double radius;
        Scanner sc=new Scanner(System.in);
         
         
        System.out.print("Enter the Radius of Circle : ");
        radius=sc.nextDouble(); 
         
        
        double Perimeter=2*3.14*radius;
        double area=3.14*radius*radius;
         
        System.out.print("Perimeter of Circle : " + Perimeter+" area of circle is :"+area);
         
    }
 
}