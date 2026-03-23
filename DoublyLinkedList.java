public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList () {
        head = null;
        size = 0;
    }

    public void pushFront(int data) {}
    public void pushBack(int data) {}
    public int popFront() { return -1; }
    public int popBack() { return -1; }
    public Node find(int data) { return null; }
    public void erase(Node node) {}
    public void addBefore(Node node, int data) {}
    public void addAfter(Node node, int data) {}
    public boolean isEmpty() { return head == null; }
    public int topFront() { return head != null ? head.data : -1; }
    public int topBack() { return -1; }
    public int size() { return size; }
}
