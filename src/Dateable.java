import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        String age = scanner.nextLine();

        int age2;
        int age3 = Integer.parseInt(age);
        System.out.println(age + " year olds should date someone who is at least " +  (7+(age3/2)) +  " years old.");
    }

}
