package stack;

public class StackTester {

    public static void main(String[] args) {
        Stack stack = new Stack(3); // creates fixed size of 3 elements stack

        stack.push(5); // push value 5
        stack.pop(); // retrieve 5
        stack.pop(); // stack empty

        stack.push(5); // push value 5
        stack.push(3); // push value 3
        stack.push(1); // push value 1
        stack.push(6); // overflow
        stack.peek(); // retrieve 1
        stack.pop(); // retrieve 1
        stack.peek(); // retrieve 3
        stack.pop(); // retrieve 3
        stack.peek(); // retrieve 5
        stack.pop(); // retrieve 5
        stack.peek(); // stack empty
        stack.pop(); // stack empty
    }
}
