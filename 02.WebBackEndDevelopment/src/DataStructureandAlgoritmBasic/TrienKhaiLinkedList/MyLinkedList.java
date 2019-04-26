package DataStructureandAlgoritmBasic.TrienKhaiLinkedList;


public class MyLinkedList<E> {
    private  Node head;
    private int numNodes;

    public class Node {
        private Object data;
        protected Node next;

        public Node (Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }

    public void addFirst (E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }



}
