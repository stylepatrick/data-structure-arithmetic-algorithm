import java.util.ArrayList;

public final class ImmutableClass {

    private final int a;
    private final String abc;

    private final ArrayList<String> list;

    public ImmutableClass(int a, String abc, ArrayList<String> list) {
        if (list == null) {
            throw new RuntimeException();
        }
        this.a = a;
        this.abc = abc;
        this.list = new ArrayList<>(list);
    }

    public int getA() {
        return a;
    }

    public String getAbc() {
        return abc;
    }

    public ArrayList<String> getList() {
        return new ArrayList<>(this.list);
    }
}
