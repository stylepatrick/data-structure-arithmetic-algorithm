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

    Book find(int isbn) {
        Book h = head;
        if (h != null) {
            while (h != null && isbn != h.isbn) {
                h = h.next;
            }
            if (h != null && isbn == h.isbn) {
                return h;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    void delete(int isbn) {
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
            System.out.println("Library empty!");
        }
    }

    void printLibrary() {
        Book h = head;
        if (h != null) {
            while (h != null) {
                System.out.println("ISBN: " + h.isbn + " Author: " + h.author + " Title: " + h.title);
                h = h.next;
            }
        } else {
            System.out.println("Library empty!");
        }
    }
}
