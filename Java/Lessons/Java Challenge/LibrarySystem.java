package OOP;

import java.util.ArrayList;

class Book {

    private String title, author;
    private boolean isAvailable = true;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    boolean getIsAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return title + " by " + author + " - " + (isAvailable ? "Available" : "Borrowed");
    }

}

class Library {

    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.getIsAvailable()) {
                    book.setIsAvailable(false);
                    System.out.println("You borrowed: " + book.getTitle());
                } else {
                    System.out.println(book.getTitle() + " is already borrowed.");
                }
                return;
            }
        }
        System.out.println(title + " not found in library.");
    }

    void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.getIsAvailable()) {
                    book.setIsAvailable(true);
                    System.out.println(book.getTitle() + " has been returned.");
                } else {
                    System.out.println(book.getTitle() + " was already availble - nothing to return.");
                }
                return;
            }
        }
        System.out.println(title + " not found in library.");
    }

    void listAvailableBooks() {
        for (Book book : books) {
            if (book.getIsAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    void listAllBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Dragon Ball", "Akira Toriyama"));
        library.addBook(new Book("One Piece", "Eiichiro Oda"));
        library.addBook(new Book("Bleach", "Tite Kubo"));
        library.addBook(new Book("Naruto", "Masashi Kishimoto"));
        library.addBook(new Book("Plate", "Some Author"));
        System.out.println("");
        library.borrowBook("One Piece");
        library.borrowBook("Dragon Ball");
        System.out.println("");
        library.returnBook("One Piece");
        library.borrowBook("Dragon Ball");
        System.out.println("");
        library.listAllBooks();
        System.out.println("");
        library.listAvailableBooks();
    }

}
