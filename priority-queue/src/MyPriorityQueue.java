public class MyPriorityQueue {

    Entry[] entries;
    int head;
    int tail;
    int length;

    MyPriorityQueue(int size){
        entries = new Entry[size];
        tail = 0;
        head = 0;
        length = 0;
    }

    MyPriorityQueue(){
        this(20);
    }

    void put(Entry entry) {
        if (tail < entries.length) {
            entries[tail] = entry;
            tail++;
            length++;
            sortByPriority();
        } else {
            System.out.println("PriorityQueue full");
        }
    }

    Entry get() {
        if (head == tail) {
            System.out.println("PriorityQueue empty");
            return new Entry(-1);
        } else {
            Entry x = entries[head];
            head++;
            length--;
            return x;
        }
    }

    int getLength() {
        return length;
    }

    private void sortByPriority() {
        for (int i = 1; i < tail; i++){
            if (entries[i].priority <= entries[i-1].priority){
                Entry dummy = entries[i];
                entries[i] = entries[i-1];
                entries[i-1] = dummy;
                if (i > 2 && entries[i-1].priority < entries[i-2].priority){
                    sortByPriority();
                }
            }
        }
    }

}
