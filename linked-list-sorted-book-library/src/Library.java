public class Library {

    Book head;

    void insert(Book b) {
        Book h = head;
        Book prev = null;
        if (h == null) {
            head = b;
        } else {
            while (h != null && b.isbn > h.isbn) {
                prev = h;
                h = h.next;
            }
            if (h == head) {
                head = b;
            } else {
                prev.next = b;
            }
            b.next = h;
        }
    }

    Book find(int isbn) throws BookNotFoundException, BookLibraryEmpty {
        Book h = head;
        if (h != null) {
            while (h != null && isbn != h.isbn) {
                h = h.next;
            }
            if (h != null) {
                return h;
            } else {
                throw new BookNotFoundException(isbn);
            }
        } else {
            throw new BookLibraryEmpty();
        }
    }

    void delete(int isbn) throws BookLibraryEmpty {
        Book h = head;
        Book prev = null;
        if (h != null) {
            while (h != null && isbn != h.isbn) {
                prev = h;
                h = h.next;
            }
            if (h != null) {
                if (h == head) {
                    head = head.next;
                } else {
                    prev.next = h.next;
                }
            }
        } else {
            throw new BookLibraryEmpty();
        }
    }

    void printLibrary() throws BookLibraryEmpty {
        Book h = head;
        if (h != null) {
            while (h != null) {
                System.out.println("ISBN: " + h.isbn + " Author: " + h.author + " Title: " + h.title);
                h = h.next;
            }
        } else {
            throw new BookLibraryEmpty();
        }
    }
}
