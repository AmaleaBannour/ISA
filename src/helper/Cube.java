package helper;

public class Cube {
    String content;
    final Position position;
    boolean canMove;
    final boolean isGoalNode;

    public Cube(String content, int x, int y, boolean canMove, boolean isGoalNode) {
        this.content = content;
        this.position = new Position(x, y);
        this.canMove = canMove;
        this.isGoalNode = isGoalNode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isGoalNode() {
        return isGoalNode;
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

    public Cube deepCopy() {
        String newContent = getContent();
        Position position = new Position(getPosition().x, getPosition().y);
        boolean canMove = isCanMove();
        boolean isGoalNode = isGoalNode();
        return new Cube(newContent, position.x, position.y, canMove, isGoalNode);
    }
}
