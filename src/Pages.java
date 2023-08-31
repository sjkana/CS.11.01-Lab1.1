import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        String age = scanner.nextLine();

        int age2 = Integer.parseInt(age);

        System.out.println(age2 + " year olds should read at least " + (100-age2) + " pages in a book before giving up.");
    }
}
