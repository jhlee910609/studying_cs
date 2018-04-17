package stack;

public interface Stack {

    boolean isEmpty();
    boolean isFull();
    void push(char item);
    char pop();
    void delete();
    char peek();

}
