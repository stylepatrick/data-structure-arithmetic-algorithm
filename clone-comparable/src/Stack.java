public class Stack implements Cloneable {

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

    public Stack clone() {
        try {
            Stack clone = (Stack) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
