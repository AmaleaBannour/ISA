package helper;

import game.State;

public class Node {
    State parent;
    Cube moveCube;
    Position disPosition;
    int cost;

    public Node(State state, Cube moveCube, Position disPosition, int cost) {
        this.parent = state;
        this.moveCube = moveCube;
        this.disPosition = disPosition;
        this.cost = cost;
    }

    public State getParent() {
        return parent;
    }

    public void setParent(State parent) {
        this.parent = parent;
    }

    public Cube getMoveCube() {
        return moveCube;
    }

    public void setMoveCube(Cube moveCube) {
        this.moveCube = moveCube;
    }

    public Position getDisPosition() {
        return disPosition;
    }

    public void setDisPosition(Position disPosition) {
        this.disPosition = disPosition;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Node deepCopy() {
        State parent = getParent();
        Cube moveCube = getMoveCube();
        Position disPosition = getDisPosition();
        int cost = getCost();
        return new Node(parent, moveCube, disPosition, cost);
    }
}
