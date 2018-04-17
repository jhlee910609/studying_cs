package stack;

public class LinkedStack implements Stack {

    private StackNode top;


    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(char item) {
        StackNode newNode = new StackNode();
        newNode.data = item;
        if (isEmpty()) {
            top = newNode;
        } else {
            top.link = newNode;
        }
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            return 0;
        } else {
            char result = top.data;
            top = top.link;
            return result;
        }
    }

    @Override
    public void delete() {
        if (isEmpty())
            System.out.println("stack is empty!");
        else {
            top = top.link;
        }
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("stack is empty!");
            return 0;
        } else {
            return top.data;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.printf("Linked Stack is empty!! %n %n");
        } else {
            StackNode temp = top;
            System.out.println("Linked Stack >> ");
            while (temp != null) {
                System.out.printf("\t %c \n ", temp.data);
                temp = top.link;
            }
        }
    }
}
