public class List {

    Node head;

    void insert(int val) {
        Node p = new Node(val);
        if (head != null) {
            p.next = head;
            head.prev = p;
        }
        head = p;
    }

    void insertAt(int val, int position) {
        Node h = head;
        Node p = new Node(val);
        if (position == 0) {
            insert(val);
        } else {
            if (h != null) {
                int i = 0;
                while (h != null) {
                    if (i == position - 1) {
                        break;
                    }
                    i++;
                    h = h.next;
                }
                if (h != null) {
                    p.next = h.next;
                    h.next = p;
                    p.prev = h;
                    if (p.next != null) {
                        p.next.prev = p;
                    }
                }
            }
        }
    }

    void append(int val) {
        Node h = head;
        Node p = new Node(val);
        if (h == null) {
            head = p;
        } else {
            while (h.next != null) {
                h = h.next;
            }
            h.next = p;
            p.prev = h;
        }
    }

    void delete(int val) {
        Node h = head;
        if (h != null) {
            while (h != null && val != h.val) {
                h = h.next;
            }
            h.prev.next = h.next;
            h.next.prev = h.prev;
        }
    }

    void deleteAt(int position) {
        Node h = head;
        if (position == 0) {
            head.next.prev = head.next;
            head = head.next;
            head.prev = null;
        } else {
            if (h != null) {
                int i = 0;
                while (h != null) {
                    if (i == position) {
                        break;
                    }
                    i++;
                    h = h.next;
                }
                if (h != null) {
                    h.prev.next = h.next;
                    if (h.next != null) {
                        h.next.prev = h.prev;
                    }
                }
            }
        }
    }

    void printList() {
        Node h = head;
        if (h != null) {
            while (h != null) {
                String row = "";
                if (h.prev != null) {
                    row = h.prev.val + " - ";
                } else {
                    row = "null - ";
                }
                row = row + h.val + " - ";
                if (h.next != null) {
                    row = row + h.next.val;
                } else {
                    row = row + "null";
                }
                System.out.println(row);
                h = h.next;
            }
        }
    }

}
