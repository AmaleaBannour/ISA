package helper;

public class Node {
    String content;
    final Position position;
    final boolean canMove;
    boolean isGoalNode;

    public Node(String content, int x, int y, boolean canMove, boolean isGoalNode) {
        this.content = content;
        this.position = new Position(x, y);
        this.canMove = canMove;
        this.isGoalNode = isGoalNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                ", position=" + position +
                ", canMove=" + canMove +
                ", isGoalNode=" + isGoalNode +
                '}';
    }
}
