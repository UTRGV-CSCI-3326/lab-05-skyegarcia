import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    System.out.print("Enter your weight: ");
    double weight = scanner.nextDouble();
    System.out.print("Are you a smoker?(True/False): ");
    boolean isSmoker = scanner.nextBoolean();
    System.out.println("User Information");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Weight: " + weight + " kg");
    System.out.println("Smoker: " + isSmoker);
    }
}
