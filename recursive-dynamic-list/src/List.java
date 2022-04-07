public class List {

    Node head;

    void append(int val, Node h, Node prev) {
        Node t = new Node(val);
        if (h == null && prev == null) {
            h = head;
        }
        if (head == null) {
            head = t;
        } else {
            if (h != null && val > h.val) {
                append(val, h.next, h);
            } else {
                if (h == head) {
                    t.next = head;
                    head = t;
                } else {
                    prev.next = t;
                    t.next = h;
                }
            }
        }
    }

    void delete(int val, Node h, Node prev) {
        if (head == null) {
            return;
        }
        if (h == null) {
            h = head;
        }
        if (val != h.val) {
            if (h.next != null) {
                delete(val, h.next, h);
            }
        } else {
            if (h == head) {
                head = head.next;
            } else {
                prev.next = h.next;
            }
        }
    }

    Node search(int val, Node h) {
        if (head == null) {
            return null;
        }
        if (h == null) {
            h = head;
        }
        if (val == h.val) {
            return h;
        } else {
            if (h.next != null) {
                return search(val, h.next);
            } else {
                return null;
            }
        }
    }

    void print(Node h) {
        if (head == null) {
            return;
        }
        if (h == null) {
            h = head;
        }
        System.out.println(h.val);
        if (h.next != null) {
            print(h.next);
        }
    }
}
