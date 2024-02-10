public class SingeltonLazy {

    private int a;

    private static SingeltonLazy instance;
    private SingeltonLazy() {}

    public SingeltonLazy getInstance() {
        if (instance == null) {
            instance = new SingeltonLazy(); // Not Thread safe; getInstance should be synchronized or double checked synchronized
        }
        return instance;
    }

    public synchronized int getA() {
        return a;
    }

    public synchronized void addA() {
        this.a = a + 5;
    }
}
