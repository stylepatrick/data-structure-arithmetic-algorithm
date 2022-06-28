public class MyElement {

    private Integer i;
    private String s;
    private Double d;
    private MySubElement mySubElement;

    private Integer key;

    public MyElement(Integer i, String s, Double d, Integer key,  MySubElement mySubElement) {
        this.i = i;
        this.s = s;
        this.d = d;
        this.key = key;
        this.mySubElement = mySubElement;
    }

    public Integer getI() {
        return i;
    }

    public String getS() {
        return s;
    }

    public Double getD() {
        return d;
    }

    public MySubElement getMySubElement() {
        return mySubElement;
    }

    public Integer getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "MyElement{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", d=" + d +
                ", mySubElement=" + mySubElement +
                ", key=" + key +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyElement)) return false;

        MyElement myElement = (MyElement) o;

        return key != null ? key.equals(myElement.key) : myElement.key == null;
    }

    @Override
    public int hashCode() {
        return key != null ? key.hashCode() : 0;
    }
}
