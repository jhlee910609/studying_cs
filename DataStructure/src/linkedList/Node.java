package linkedList;

public class Node {

    public String data;
    public Node link;

    public Node() {
        this.data = null;
        this.link = null;
    }

    public Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    public Node(String data) {
        this.data = data;
        this.link = null;
    }
}
