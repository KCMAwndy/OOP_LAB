package Week2;

//Game: scissor, rock, paper
import java.util.Scanner;
import java.util.Random;

public class Pro2_64010989 {
    public static void main(String[] args){
        String[] spr = {"scissor","rock","paper"};
        String[] result = {"You won","You lost","It is a draw"};
        System.out.print("scissor (0), rock(1), paper(2): ");
        Scanner input = new Scanner(System.in);
        int player = input.nextInt();
        Random random = new Random();
        int bot = random.nextInt(3);
        int ans=0;
        input.close();
        if(player==0){
            if(bot==0)
                ans=2;
            else if(bot==1)
                ans=1;
            else
                ans=0;
        }
        else if(player==1){
            if(bot==0)
                ans=0;
            else if(bot==1)
                ans=2;
            else
                ans=1;
        }
        else{
            if(bot==0)
                ans=1;
            else if(bot==1)
                ans=0;
            else
                ans=2;
        }
        System.out.println("The computer is "+spr[bot]+". You are "+spr[player]+". "+result[ans]);
    }
}
