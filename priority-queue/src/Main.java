public class Main {

    public static void main(String args[]) {
        MyPriorityQueue priorityQueue = new MyPriorityQueue();

        Entry entry = new Entry(10, 3);
        Entry entry1 = new Entry(20, 1);
        Entry entry2 = new Entry(30, 2);
        Entry entry3 = new Entry(40, 3);
        Entry entry4 = new Entry(50, 1);
        Entry entry5 = new Entry(60, 2);
        Entry entry6 = new Entry(70, 1);
        Entry entry7 = new Entry(80, 2);
        Entry entry8 = new Entry(90, 1);
        Entry entry9 = new Entry(100, 1);

        priorityQueue.put(entry);
        priorityQueue.put(entry1);
        priorityQueue.put(entry2);
        priorityQueue.put(entry3);
        priorityQueue.put(entry4);
        priorityQueue.put(entry5);
        priorityQueue.put(entry6);
        priorityQueue.put(entry7);
        priorityQueue.put(entry8);
        priorityQueue.put(entry9);

        int priorityLength = priorityQueue.getLength();
        for (int i = 0; i < priorityLength; i++) {
            Entry a = priorityQueue.get();
            System.out.println(a.value + " - " + a.priority);
        }
    }
}
