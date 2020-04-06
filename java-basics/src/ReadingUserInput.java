import java.util.Scanner;

public class ReadingUserInput {

    //in this example we will read user's input using the scanner util class

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth: ");
        int birthYear = scanner.nextInt();

        int age = calculateAge(birthYear);

        if(age >= 0 && age <= 105) {
            System.out.println("Hello " + name + ", you are " + age + " years old!");
        } else {
            System.out.println("Invalid Birth Year!!!");
        }
    }

    public static int calculateAge(int year){

      return 2020 - year;

    }
}
