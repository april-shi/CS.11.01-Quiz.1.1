import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter your First Name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your favourite food!");
        String favouriteFood = scanner.nextLine();

        System.out.println("First Name: " + firstName + "\nAge: " + age + "\nFavourite Food: " + favouriteFood);





    }
}