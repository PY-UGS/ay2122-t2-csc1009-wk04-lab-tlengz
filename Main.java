import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter weight in pounds: ");
        Double weight = input.nextDouble();

        System.out.println("Enter height in inches: ");
        Double height = input.nextDouble();

        input.close();

        BMI calBMI = new BMI(weight, height);
        System.out.println("BMI is " + calBMI.calBMI());
        calBMI.Interpretation();
    }
}
