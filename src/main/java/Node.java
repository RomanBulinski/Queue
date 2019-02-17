public class Node {

    private String value;
    protected Node nextNode;

    public Node(){
    };

    public Node(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }
}