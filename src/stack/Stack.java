package stack;

public class Stack {
    private final int[] array;
    private int top;

    public Stack(int size) {
        this.array = new int[size];
        this.top = -1;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int pop = array[top--];
        System.out.println(pop + " Popped!");
        return pop;
    }

    public void push(int value) {
        if (top == array.length - 1) {
            System.out.println("Stack is Full!");
            return;
        }
        array[++top] = value;
        System.out.println(value + " Pushed!");
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int peek = array[top];
        System.out.println(peek + " is the last element!");
        return peek;
    }
}
