package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
        // Check if queue has no elements
        return frontNode == null;
    }

    public void offer(String data) {
        // Offer element to queue
        Node node = new Node(data);
        if (isEmpty()) {
          frontNode = node;
          backNode = frontNode;
        }
        else {
          backNode.setNextNode(node);
          backNode = node;
        }
    }

    public String poll() {
        // Poll element from queue
        if (isEmpty()) {
          return null;
        }
        else {
          String data = frontNode.getData();
          frontNode = frontNode.getNextNode();
          return data;
        }
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(frontNode);
    }
}
