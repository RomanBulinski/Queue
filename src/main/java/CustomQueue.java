public class CustomQueue {


    private Node head;
    private Node end_tail;
    private int listCount=0;

    public CustomQueue(){
    }

    public void enqueue (String value){
        Node currentNode = head;
        if(head == null){
            head = new Node(value);
            return;
        }
        while( currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(new Node(value));
        listCount++;
    }

    public String peek(){
        return head.getValue();
    }

    public String dequeue(){
        Node currentNode = head;
        String tempValue = currentNode.getValue();
        if( currentNode.getNextNode() != null){
            head = currentNode.getNextNode();
            listCount--;
        }
        return tempValue;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int queueSize() {
        int size = 0;
        Node currentNode = head;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.nextNode;
        }
        return size;
    }


}
