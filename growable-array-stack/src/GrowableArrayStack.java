public class GrowableArrayStack {

    int length;
    int[] stack;

    GrowableArrayStack(int length) {
        stack = new int[length];
        this.length = 0;
    }

    void push(int val) {
        if (length > stack.length -1) {
            int[] copyStack = new int[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                copyStack[i] = stack[i];
            }
            stack = copyStack;
        }
        stack[length] = val;
        length++;
    }

    int pop() {
        if (length != 0) {
            length--;
            return stack[length];
        }
        return -1;
    }

}
