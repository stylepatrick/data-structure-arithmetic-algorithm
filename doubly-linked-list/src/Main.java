public class Main {

    public static void main(String args[]) {
        List list = new List();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.insert(0);

        list.insertAt(9, 2);

        list.delete(9);

        list.deleteAt(4);

        list.append(6);

        list.printList();

    }
}
