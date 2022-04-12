public class MyList {

    Node tail;
    Node head;

    void insert(int val) {
        Node h = head;
        Node p = new Node(val);
        p.next = h;
        head = p;
        if (h == null) {
            tail = p;
        }
    }

    void append(int val) {
        Node p = new Node(val);
        if (head == null) {
            head = p;
        } else {
            tail.next = p;
        }
        tail = p;
    }

    void delete(int val) {
        Node h = head;
        Node prev = null;
        if (h != null) {
            while (h != null && h.val != val) {
                prev = h;
                h = h.next;
            }
            if (h != null) {
                if (h == head) {
                    head = h.next;
                } else if (h == tail) {
                    prev.next = null;
                    tail = prev;
                } else {
                    prev.next = h.next;
                }
            }
        } else {
            System.out.println("List empty!");
        }

    }

    void insertAt(int val, int position) {
        Node h = head;
        Node next;
        Node p = new Node(val);
        if (position == 0) {
            next = head;
            head = p;
            p.next = next;

        } else {
            int i = 1;
            if (h != null) {
                while (h.next != null) {
                    if (i == position) {
                        if (h == tail) {
                            tail.next = p;
                            tail = p;
                        } else {
                            next = h.next;
                            h.next = p;
                            p.next = next;
                        }
                        return;
                    }
                    i++;
                    h = h.next;
                }
                System.out.println("Position out of range!");
            }
        }
    }

    void deleteAt(int position) {
        Node h = head;
        Node prev = null;
        if (position == 0) {
            head = head.next;
        } else {
            int i = 0;
            while (h.next != null) {
                if (i == position - 1) {
                    prev = h;
                } else if (i == position) {
                    if (h == tail) {
                        tail = prev;
                    } else {
                        prev.next = h.next;
                    }
                    return;
                }
                i++;
                h = h.next;
            }
            System.out.println("Position out of range!");

        }
    }

    void deleteLast() {
        Node h = head;
        Node prev = null;
        if (h != null) {
            while (h.next != null) {
                prev = h;
                h = h.next;
            }
            prev.next = null;
            tail = prev;
        } else {
            System.out.println("List empty!");
        }
    }

    void deleteFirst() {
        Node h = head;
        if (h != null) {
            head = h.next;
        } else {
            System.out.println("List empty!");
        }
    }

    int exist(int val) {
        Node h = head;
        if (head == null) {
            System.out.println("MyList is empty");
        } else {
            while (h.next != null) {
                if (h.val == val) {
                    return h.val;
                }
                h = h.next;
            }
        }
        return -1;
    }

    void printList() {
        Node h = head;
        if (h == null) {
            System.out.println("MyList is empty!");
        } else {
            while (h.next != null) {
                System.out.println(h.val);
                h = h.next;
            }
            System.out.println(h.val);
        }
    }

}
