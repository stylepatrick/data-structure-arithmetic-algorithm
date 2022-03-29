public abstract class Node<T> implements Comparable<T> {

    Node<T> next;

    public abstract int compareTo(T h);

}
