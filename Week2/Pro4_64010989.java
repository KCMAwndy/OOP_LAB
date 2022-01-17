package Week2;

//Order three cities
import java.util.Scanner;
public class Pro4_64010989 {
    public static void main(String[] args) {
        String[] arrayCity = new String[3];
        String temp ="";
        Scanner input = new Scanner(System.in);
        System.out.print("The first cities: ");
        arrayCity[0]=input.nextLine();
        System.out.print("The second cities: ");
        arrayCity[1]=input.nextLine();
        if(arrayCity[0].compareTo(arrayCity[1])<0){
            temp=arrayCity[0];
            arrayCity[0]=arrayCity[1];
            arrayCity[1]=temp;
        }
        System.out.print("The third cities: ");
        arrayCity[2]=input.nextLine();
        input.close();
        if(arrayCity[0].compareTo(arrayCity[2])<0){
            temp=arrayCity[0];
            arrayCity[0]=arrayCity[2];
            arrayCity[2]=temp;
            if(arrayCity[1].compareTo(arrayCity[2])<0){
                temp=arrayCity[1];
                arrayCity[1]=arrayCity[2];
                arrayCity[2]=temp;
            }
        }
        System.out.println(arrayCity[2]+" "+arrayCity[1]+" "+arrayCity[0]);
    }
}
