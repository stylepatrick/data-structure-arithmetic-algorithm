public class Main {

    public static void main(String args[]) {
        MyList myList = new MyList();
        // Append values to last position from list
        myList.append(1);
        myList.append(2);
        myList.append(3);

        // Insert values at the beginning of the list
        myList.insert(0);
        myList.insert(-1);

        myList.append(4);

        System.out.println("-------- Lookup in List ----------");
        System.out.println(myList.exist(2));
        System.out.println(myList.exist(22));

        System.out.println("-------- Print full List ----------");
        myList.printList();

        // Find and delete value from list
        myList.delete(3);

        // Insert value at specific position
        myList.insertAt(-9, 2);

        // Delete at specific position
        myList.deleteAt(2);

        // Delete last value
        myList.deleteLast();

        // Delete first value
        myList.deleteFirst();

        myList.delete(0);

        myList.delete(2);

        myList.append(3);

        System.out.println("-------- Print full List ----------");
        myList.printList();

    }
}
