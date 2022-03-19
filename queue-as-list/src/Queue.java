public class Queue {

    Node head;
    Node tail;

    void push(int val) {
        Node p = new Node(val);
        if (head == null) {
            head = p;
        } else {
            tail.next = p;
        }
        tail = p;
    }

    int get() {
        if (head != null) {
            Node q = head;
            head = head.next;
            return q.val;
        } else {
            tail = null;
            return -1;
        }
    }

}
