import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Name: ");
                String name = sc.nextLine();

                books.add(new Book(id, name));

                System.out.println("Book Added Successfully!");
                break;

            case 2:
                if (books.isEmpty()) {
                    System.out.println("No Books Available!");
                } else {
                    for (Book b : books) {
                        System.out.println(b);
                    }
                }
                break;

            case 3:
                System.out.print("Enter Book ID to Issue: ");
                int issueId = sc.nextInt();

                for (Book b : books) {
                    if (b.id == issueId) {
                        b.issued = true;
                        System.out.println("Book Issued Successfully!");
                    }
                }
                break;

            case 4:
                System.out.print("Enter Book ID to Return: ");
                int returnId = sc.nextInt();

                for (Book b : books) {
                    if (b.id == returnId) {
                        b.issued = false;
                        System.out.println("Book Returned Successfully!");
                    }
                }
                break;

            case 5:
                System.out.println("Thank You!");
                System.exit(0);

            default:
                System.out.println("Invalid Choice!");
            }
        }
    }
}