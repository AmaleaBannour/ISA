package game;

import helper.initState;

public class Main {
    public static void main(String[] args) {
        State state = new State(initState.level1);
        State newState = state.deepCopy();
        state.level[1][1].setContent("test");
        System.out.println(state.level[1][1].getContent());
        System.out.println(newState.level[1][1].getContent());
    }
}
