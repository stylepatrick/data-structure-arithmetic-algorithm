public class Stack {

    private Node head;

    public void push(Node i) {
        if (head != null) {
            i.next = head;
        }
        head = i;
    }

    public Node pop() {
        Node h = head;
        if (h == null) {
            System.out.println("Stack empty!");
        } else {
            head = head.next;
        }
        return h;
    }

    // Clone Methode used without calling the super.clone Methode from Object due to deeper references in Stack
    public Stack clone() {
        Stack clone = new Stack();
        clone.head = head.clone();
        Node h = clone.head;
        Node n = head.next;
        while (n != null) {
            h.next = n.clone();
            h = h.next;
            n = n.next;
        }
        return clone;
    }

}
