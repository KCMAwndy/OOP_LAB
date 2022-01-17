package Week2;

//Future Dates
import java.util.Scanner;
public class Pro1_64010989 {
    public static void main(String[] args){
        String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int future = input.nextInt();
        input.close();
        System.out.print("Today is "+week[today]+" and the future day is "+week[(today+future)%7]);
    }
}
