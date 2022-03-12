public class Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Output should be 3 * 3 = 6
        System.out.println(stack.pop() * stack.pop());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        for (int i = 0; i <= stack.getLength(); i++) {
            stack.push(i);
        }
    }

}
