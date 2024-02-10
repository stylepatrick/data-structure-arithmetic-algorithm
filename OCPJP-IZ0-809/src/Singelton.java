public class Singelton {

    private int a;

    private static final Singelton instance = new Singelton();
    private Singelton() {}

    public Singelton getInstance() {
        return instance;
    }

    public synchronized int getA() {
        return a;
    }

    public synchronized void addA() {
        this.a = a + 5;
    }
}
