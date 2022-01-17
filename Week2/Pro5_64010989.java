package Week2;

//Display pyramid
import java.util.Scanner;
public class Pro5_64010989 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        for(int i=0;i<num;i++){
            for(int j=num-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int h=i+1;h>0;h--){
            System.out.print(h);
            }
            for(int l=2;l<=i+1&&i>0;l++){
                System.out.print(l);
            }
            System.out.println("");
        }
    }  
}
