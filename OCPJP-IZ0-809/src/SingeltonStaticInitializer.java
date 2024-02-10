public class SingeltonStaticInitializer {

    private int a;

    private static final SingeltonStaticInitializer instance;

    static {
        instance = new SingeltonStaticInitializer();
    }
    private SingeltonStaticInitializer() {}

    public SingeltonStaticInitializer getInstance() {
        return instance;
    }

    public synchronized int getA() {
        return a;
    }

    public synchronized void addA() {
        this.a = a + 5;
    }
}
