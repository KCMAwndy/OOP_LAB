package Week1;

//Sum the digit in an integer
import java.util.Scanner;
public class Pro3_64010989 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        int totalNum = 0;
        while(num>0){
        totalNum += num%10;
        num/=10;
        }
        System.out.print("The sum of the digit is "+totalNum);
    }
}
