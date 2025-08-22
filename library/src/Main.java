package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static List<Book> bookList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Choose a digit for following options");
            System.out.println("1. Add a book");
            System.out.println("2. Get a list of books");
            System.out.println("3. Get information about book");
            System.out.println("4. Delete a book");

            System.out.print(">>>> ");
            switch (sc.nextInt()) {
                case 1 -> addBook();
                case 2 -> getList();
                case 3 -> getBook();
                case 4 -> deleteBook();
            }

            System.out.println("\n*****************************\n");
        }
    }

    public static void addBook() {

        int id = new Random().nextInt(900) + 100;

        System.out.println("\nEnter the name of the book");
        String name = sc.next();

        System.out.println("Enter the author of the book");
        String author = sc.next();

        System.out.println("Enter the year of the book");
        int year = sc.nextInt();

        bookList.add(new Book(id, name, author, year));

        System.out.printf("Book added with id: %d%n", id);
    }

    public static void getList() {

        if (bookList.isEmpty()) {
            System.out.println("\nNo books found\n");
        } else {
            System.out.println("\nTable of book list\n");
            System.out.printf("%-5s %-20s %-20s %-6s%n", "Id", "Name", "Author", "Year");
            System.out.println("-------------------------------------------------------------");

            for (Book book : bookList) {
                System.out.printf("%-5d %-20s %-20s %-6d%n",
                        book.getId(), book.getName(), book.getAuthor(), book.getYear());
            }
        }
    }

    public static void getBook() {
        System.out.print("\nEnter the id of the book: ");
        int id = sc.nextInt();

        bookList.forEach(book -> {
            if (book.getId() == id) {
                System.out.println(book);
            }
        });
    }

    public static void deleteBook() {

        System.out.print("\nEnter the id of the book: ");
        int id = sc.nextInt();

        bookList.removeIf(book -> book.getId() == id);

        System.out.printf("Removed book with id: %d%n", id);
    }
}
