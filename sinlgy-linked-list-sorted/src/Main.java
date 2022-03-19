public class Main {

    public static void main(String args[]) {
        MyList myList = new MyList();
        myList.insert(1);
        myList.insert(3);
        myList.insert(5);
        myList.insert(4);
        myList.insert(2);
        myList.insert(6);

        System.out.println("---------Print List----------");
        myList.printList();

        System.out.println(myList.exist(4));

        myList.delete(6);

        System.out.println("---------Print List----------");
        myList.printList();

        myList.deleteAt(0);

        System.out.println("---------Print List----------");
        myList.printList();

    }
}
