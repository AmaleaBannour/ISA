package game;


import helper.Cube;

import java.util.ArrayList;

public class State {
    ArrayList<Cube> cubeSolutions = new ArrayList<>();
    Cube[][] level;

    public State(Cube[][] level) {
        this.level = level;
        findSolutions();
    }

    public State(ArrayList<Cube> cubeSolutions, Cube[][] level) {
        this.cubeSolutions = cubeSolutions;
        this.level = level;
    }

    boolean isFinal() {
        return true;
    }

    void findSolutions() {
        for (Cube[] cubes : level) {
            for (Cube cube : cubes) {
                if (cube.isGoalNode()) {
                    cubeSolutions.add(cube);
                }
            }
        }
    }

    State deepCopy() {
        ArrayList<Cube> copySolutions = new ArrayList<>();
        for (Cube cube : cubeSolutions) {
            copySolutions.add(cube.deepCopy());
        }
        Cube[][] copyLevel = new Cube[level.length][level[0].length];
        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level[i].length; j++) {
                copyLevel[i][j] = level[i][j].deepCopy();
            }
        }
        return new State(copySolutions, copyLevel);
    }
}
