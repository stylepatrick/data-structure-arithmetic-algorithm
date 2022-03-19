public class MyList {

    Node head;

    void insert(int val) {
        Node p = new Node(val);
        Node h = head;
        Node prev = null;
        if (h == null) {
            head = p;
        } else {
            while (h != null && val > h.val) {
                prev = h;
                h = h.next;
            }
            prev.next = p;
            p.next = h;
        }
    }

    void delete(int val) {
        Node h = head;
        Node prev = null;
        if (h != null) {
            while (h != null && val != h.val) {
                prev = h;
                h = h.next;
            }
            if (h != null) {
                if (h == head) {
                    head = h.next;
                } else {
                    prev.next = h.next;
                }
            }
        } else {
            System.out.println("List empty!");
        }
    }

    void deleteAt(int position) {
        Node h = head;
        Node prev;
        if (h != null) {
            if (position == 0) {
                head = head.next;
            } else {
                int i = 1;
                while (h != null) {
                    prev = h;
                    h = h.next;
                    if (h != null && i == position) {
                        prev.next = h.next;
                        return;
                    }
                    i++;
                }
                System.out.println("Position out of range!");
            }
        } else {
            System.out.println("List empty!");
        }

    }

    int exist(int val) {
        Node h = head;
        if (h != null) {
            while (h != null && val > h.val) {
                h = h.next;
            }
            if (h != null && h.val == val) {
                return h.val;
            }
        } else {
            System.out.println("List empty!");
        }
        return -1;
    }

    void printList() {
        Node h = head;
        if (h == null) {
            System.out.println("List empty!");
        } else {
            while (h != null) {
                System.out.println(h.val);
                h = h.next;
            }
        }
    }

}
