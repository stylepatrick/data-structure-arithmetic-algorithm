public class Stack {

    Node top;

    void push(int val) {
        Node p = new Node(val);
        p.next = top;
        top = p;
    }

    int pop() {
        Node p = top;
        if (p != null) {
            top = p.next;
            return p.val;
        } else {
            return -1;
        }
    }

}
