
// Samantharasraya
import java.util.Scanner;

class Parallelogram {
    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);

        System.out.println("Enter Stand Lenght");
        Double standLength = Values.nextDouble();
        System.out.println("Enter Direct high");
        Double direct_high = Values.nextDouble();

        Double Area = standLength * direct_high;
        System.out.println("Your Parallelogram Area is :" + " " + Area);
    }
}
