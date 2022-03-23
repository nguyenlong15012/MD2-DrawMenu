import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.print("Menu: ");
        System.out.print("\n1. Draw the triangle. ");
        System.out.print("\n2. Draw the square. ");
        System.out.print("\n3. Draw the rectangle. ");
        System.out.print("\n0. Exit. ");
        System.out.print("\nEnter your choice: ");

        choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square ");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
//                default:
//                    System.out.println("No choice!");
            }
        } while (choice != 0);

    }
}
