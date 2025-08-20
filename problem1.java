/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package santiago_activity1;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       System.out.println("Enter your Age");
      
       int Age=input.nextInt();
       System.out.println(Age);
       
       if (Age<13){
           System.out.println("You are a Child");
           
       }
       else if (Age>=13 && Age<=19){
           System.out.println("You are a Teenager");
       }
       else {
           System.out.println("You are an Adult ");
       }
        
       
        
        System.out.println("Enter today's temperature in Celsius");
        double Temperature=input.nextDouble();
        System.out.println(Temperature);
        if (Temperature<0){
         System.out.println("Freezing point");
        }
        else if(Temperature>=0 && Temperature<=25){
            System.out.println("Normal Weahther");
       }
        else {
            System.out.println("Hot Weather");
        }
        System.out.println("Enter your Test Score(out of 100)");
       int score=input.nextInt();
       System.out.println(score);
       
       if (score>=90){
           System.out.println("Excellent");
           
       }
       else if (score>=75 && score<90){
           System.out.println("Good");
       }
       else {
           System.out.println("Needs Improvement");
       }
    System.out.println("Enter the radius of a circle");
     System.out.println("Area of a circle");
    double radius=input.nextDouble();
    System.out.println(radius);
    double x=Math.PI, y=radius;
  
    if (radius<=0){
         System.out.println("Invalid radius");
    }
    else {
         System.out.println(x*Math.pow(y, 2));
    }
    System.out.println("Circumference of a circle");
    double radius2=input.nextDouble();
      double z=radius2;
    System.out.println(radius2);
    if (radius2<=0){
         System.out.println("Invalid radius");
    }
    else{
         System.out.println(2*x*z);
    }
    
    System.out.println("Enter an integer");
    int integer=input.nextInt();
    System.out.println(integer);
    
   if (integer % 2==0){
       System.out.println("Integer is even");
   }
   else{
       System.out.println("Integer is odd");
   }
    
    
    }
}

