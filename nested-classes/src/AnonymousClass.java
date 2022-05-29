public interface AnonymousClass {
    String abc(String x);

    default void test() {
        System.out.println("test");
    }
}
