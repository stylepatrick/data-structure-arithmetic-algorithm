public class Entry {

    int value;
    // 1 highest priority, 3 lowest priority
    int priority;

    Entry(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    Entry(int value) {
        this.value = value;
        this.priority = 3;
    }

}
