public class BookNotFoundException extends Exception {

    public int isbn;

    public BookNotFoundException(int isbn) {
        this.isbn = isbn;
    }

}
