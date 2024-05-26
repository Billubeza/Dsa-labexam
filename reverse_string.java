class Stack<T> {
    private T[] items;
    private int top;

    public Stack(int capacity) {
        items = (T[]) new Object[capacity]; 
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return items[top];
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return items[top--];
    }

    public void push(T item) {
        if (top == items.length - 1) {
            throw new IllegalStateException("Stack overflow");
        }
        items[++top] = item;
    }
}

public class ReverseString { 

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>(str.length());
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String originalString = "hello";
        String reversedString = reverseString(originalString);
        System.out.println("Original string is: " + originalString);
        System.out.println("Reversed string is: " + reversedString);
    }
}
