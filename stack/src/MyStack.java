public class MyStack {

    int[] stack;
    int length;

    MyStack(int size) {
        this.stack = new int[size];
        this.length = 0;
    }

    void push(int i) {
        if (length == stack.length - 1) {
            System.out.println("Stack full");
        } else {
            stack[length] = i;
            length++;
        }
    }

    int pop(){
        if (length == 0) {
            System.out.println("Stack empty");
            return -1;
        } else {
            length--;
            return stack[length];
        }
    }

    int getLength(){
        return length;
    }

}
