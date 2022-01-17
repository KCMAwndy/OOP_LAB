package Week1;

//Health application
import java.util.Scanner;

public class Pro4_64010989 {
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds : ");
        Scanner input = new Scanner(System.in);
        float lb = input.nextFloat();
        System.out.print("Enter weight in inches : ");
        float inch = input.nextFloat();
        input.close();
        float BMI = (lb*0.45359237F)/(inch*0.0254F*inch*0.0254F);
        System.out.printf("BMI is %.4f",BMI); 
    }
}
