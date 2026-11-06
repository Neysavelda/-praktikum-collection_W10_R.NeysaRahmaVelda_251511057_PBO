import java.util.ArrayList;

public class GenericStack<T> {
    private int maxsize;
    private ArrayList<T> items;

    public GenericStack(int maxsize) {
        if (maxsize <= 0)
            throw new GenericStackException("Stack size must be positive");
        items = new ArrayList<T>();
        this.maxsize = maxsize;
    }

    public void push(T item) {
        if (items.size() == maxsize)
            throw new GenericStackException("Overflow Error");
        items.add(item);
    }

    public T pop() {
        if (isEmpty())
            throw new GenericStackException("Underflow Error");
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public static class GenericStackException extends RuntimeException {
        public GenericStackException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<Integer>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop 1: " + stack.pop());
        System.out.println("Pop 2: " + stack.pop());
        System.out.println("Pop 3: " + stack.pop());
    }
}
