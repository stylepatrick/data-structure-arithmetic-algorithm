public class Main {

    public static void main(String args[]) {
        Library library = new Library();
        Book book1 = new Book(89, "MM", "Book 123");
        Book book2 = new Book(9999, "Lee", "Java 17");
        Book book3 = new Book(1234, "Patrick", "Summer");
        Book book4 = new Book(11, "Jan", "Java");
        Book book5 = new Book(1, "Michael", "Database");

        library.insert(book1);
        library.insert(book2);
        library.insert(book3);
        library.insert(book4);
        library.insert(book5);

        library.printLibrary();

        int isbn = 11;
        System.out.println("Search Book");
        findBook(library, isbn);

        System.out.println("Delete Book");
        library.delete(isbn);

        findBook(library, isbn);

        Book book6 = new Book(4541, "Michael", "Database");
        library.insert(book6);

        library.printLibrary();
    }

    public static void findBook(Library library, int isbn) {
        Book foundBook = library.find(isbn);
        if (foundBook != null) {
            System.out.println("ISBN: " + foundBook.isbn + " Author: " + foundBook.author + " Title: " + foundBook.title);
        } else {
            System.out.println("Book with ISBN: " + isbn + " not found!");
        }
    }
}
