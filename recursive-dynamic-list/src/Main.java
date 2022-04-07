public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.append(5, null, null);
        list.append(3, null, null);
        list.append(4, null, null);
        list.append(1, null, null);
        list.append(2, null, null);

        list.delete(5, null, null);

        Node a = list.search(2, null);

        list.print(null);
    }
}
