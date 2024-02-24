import java.util.Scanner;
public class Inchtometer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input the Inch value");
        double inch=input.nextDouble();
        double Meters=inch*0.0254;
        System.out.println(inch+"in inches to"+Meters+"in meters");
    }
}
