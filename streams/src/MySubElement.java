public final class MySubElement {

    private String substring;

    public MySubElement(String substring) {
        this.substring = substring;
    }

    public String getSubstring() {
        return substring;
    }

    @Override
    public String toString() {
        return "MySubElement{" +
                "substring='" + substring + '\'' +
                '}';
    }
}
