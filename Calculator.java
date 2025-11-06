package corejava;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int v1 = s.nextInt();
        System.out.println("Enter the second value:");
        int v2 = s.nextInt();
        System.out.println("*********Choice**********");
        System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.moddiv");
        System.out.println("Enter your choice:");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                Addition.Addition1 ad = new Addition.Addition1();
                System.out.println("Sum result is: " + ad.add(v1, v2));
                break;
            case 2:
                Addition.Substraction sb = new Addition.Substraction();
                System.out.println("Sub result is: " + sb.sub(v1, v2));
                break;
            case 3:
                Addition.Multiplication ml = new Addition.Multiplication();
                System.out.println("Multiplication result is: " + ml.mul(v1, v2));
                break;
            case 4:
                Addition.Division dv = new Addition.Division();
                System.out.println("Division result is: " + dv.div(v1, v2));
                break;
            case 5:
                Addition.ModDivision md = new Addition.ModDivision();
                System.out.println("ModDivision result is: " + md.moddiv(v1, v2));
                break;
            default:
                System.out.println("Invalid choice...");
        }
    }
}