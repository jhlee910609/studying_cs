package stack;

public class ArrayStack implements Stack {

    private int top;
    private int stackSize;
    private char itemArray[];

    public ArrayStack(int stackSize) {
        this.top = -1;
        this.stackSize = stackSize;
        itemArray = new char[this.stackSize];
    }

    @Override

    public boolean isEmpty() {
        return (this.top == -1);
    }

    @Override
    public boolean isFull() {
        return (this.top == (stackSize - 1));
    }

    @Override
    public void push(char item) {
        if (isFull()) {
            System.out.println("stack is full!");
        } else {
            itemArray[top++] = item;
            System.out.println("item inserted is completed!");
        }
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            System.out.println("stack is empty!");
            return 0;
        } else {
            return itemArray[top--];
        }
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("Deleting fail! ArrayStack is empty!");
        } else
            top--;

    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Peeking is fail! Array stack is empty!!");
            return 0;
        } else {
            return itemArray[top];
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.printf("Array stack is empty!! %n %n");
        } else {
            System.out.println("Array Stack >> ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("%s", itemArray[i]);
            }
        }
    }
}
