package Week1;

//Linear equaion
public class Pro2_64010989 {
    public static void main(String[] args) {
        System.out.print("The following equation :\n3.4x + 50.2y = 44.5\n2.1x + 0.55y = 5.9\n");
        float a=3.4F,b=50.2F,e=44.5F;
        float c=2.1F,d=0.55F,f=5.9F;
        float x=(e*d-b*f)/(a*d-b*c) , y=(a*f-e*c)/(a*d-b*c);
        System.out.printf("x = %f , y = %f",x,y);
    }
}
