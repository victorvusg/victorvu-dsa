package DataStructure.Linear.Dynamic.Stack;

public class Main {

    public static void main(String[] args) {
        runLinkedListStack();
    }

    public static void runArrayStack() {
        ArrayStack<Integer> arrayStack =
                new ArrayStack<Integer>();
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.push(40);


        System.out.println(arrayStack.toString());

        System.out.println(arrayStack.peek());

        int popValue = arrayStack.pop();

        System.out.println(popValue);

        System.out.println(arrayStack.peek());
    }

    public static void runLinkedListStack() {
        LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println(stack.toString());
    }
}
