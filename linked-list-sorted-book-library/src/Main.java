public class Main {

    public static void main(String args[]) {
        Library library = new Library();
        Book book1 = new Book(89, "MM", "Book 123");
        Book book2 = new Book(9999, "Lee", "Java 17");
        Book book3 = new Book(1234, "Patrick", "Summer");
        Book book4 = new Book(11, "Jan", "Java");
        Book book5 = new Book(1, "Michael", "Database");

        try {
            library.printLibrary();
        } catch (BookLibraryEmpty e) {
            e.printEmptyMessage();
        }

        library.insert(book1);
        library.insert(book2);
        library.insert(book3);
        library.insert(book4);
        library.insert(book5);

        try {
            library.printLibrary();
        } catch (BookLibraryEmpty e) {
            e.printEmptyMessage();
        }

        int isbn = 11;
        System.out.println("Search Book");
        findBook(library, isbn);

        System.out.println("Delete Book");
        try {
            library.delete(isbn);
        } catch (BookLibraryEmpty e) {
            e.printEmptyMessage();
        }

        findBook(library, isbn);

        Book book6 = new Book(4541, "Michael", "Database");
        library.insert(book6);

        try {
            library.printLibrary();
        } catch (BookLibraryEmpty e) {
            e.printEmptyMessage();
        }
    }

    public static void findBook(Library library, int isbn) {
        try {
            Book foundBook = library.find(isbn);
            System.out.println("ISBN: " + foundBook.isbn + " Author: " + foundBook.author + " Title: " + foundBook.title);
        } catch (BookNotFoundException e) {
            System.out.println("Book with ISBN: " + e.isbn + " not found!");
        } catch (BookLibraryEmpty e) {
            e.printEmptyMessage();
        }
    }
}
