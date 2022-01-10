public class Pro1_64010989 {
    public static void main(String[] args) {
        long birthTotal = (5*365*24*60*60)/7;
        long deathTotal = (5*365*24*60*60)/13;
        long immigTotal = (5*365*24*60*60)/45;
        // System.out.println("The each five years population :");
        // System.out.printf("Bitrth Population = %d\nDeath Population = %d\nImmigrant Population = %d\n",birthTotal,deathTotal,immigTotal);
        System.out.print("The total five years population is " + (312032486L+(birthTotal-deathTotal+immigTotal)));
    }  
}
