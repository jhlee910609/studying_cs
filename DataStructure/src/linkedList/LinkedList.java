package linkedList;

public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertMiddleNode(Node pre, String data) {
        Node newNode = new Node(data);
        newNode.link = pre.link;
        pre.link = newNode;
    }

    public void insertLastNode(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            Node tempNode = head;
            while (tempNode.link != null) {
                tempNode = tempNode.link;
            }
            tempNode.link = newNode;
        }
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("더 이상 삭제할 노드가 없습니다.");
            return;
        }

        if (head.link == null)
            head = null;

        else {
            Node pre, temp;

            pre = head;
            temp = head.link;

            while (temp.link != null) {
                pre = temp;
                temp = pre.link;
            }
            pre.link = null;
        }
    }

    public Node searchNode(String data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(data))
                return temp;
            else
                temp = temp.link;
        }
        return temp;
    }

    public void reverseList() {
        Node next = head;
        Node current = null;
        Node pre = null;

        while (next != null) {
            pre = current;
            current = next;
            next = next.link;
            current.link = pre;
        }
        head = current;
    }

    public void printList() {
        Node temp = head;
        System.out.println("========== [ node list ] ==========");
        while (temp.link != null) {
            System.out.println("========== [ " + temp.data + " ] ==========");
            temp = temp.link;
        }
        System.out.println("============================");
    }
}


