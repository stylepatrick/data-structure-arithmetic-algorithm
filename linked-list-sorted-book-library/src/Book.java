public class Book {

    int isbn;
    String author;
    String title;
    Book next;

    Book(int isbn, String author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

}
