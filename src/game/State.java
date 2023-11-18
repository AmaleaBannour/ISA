package game;


import helper.Cube;
import helper.Node;

import java.util.ArrayList;
import java.util.Collections;

public class State {

    Cube[][] level;
    Node node ;
    String hashState;
    ArrayList<Cube> cubeSolutions = new ArrayList<>();

    public State() {

    }

    public State(Cube[][] level) {
        this.level = level;
        node.setParent(null);
        node.setCost(0);
        node.setMoveCube(null);
        node.setDisPosition(null);
        findSolutions();
    }

    public State(ArrayList<Cube> cubeSolutions, Cube[][] level) {
        this.cubeSolutions = cubeSolutions;
        this.level = level;
    }

    public State(ArrayList<Cube> cubeSolutions, Cube[][] level, Node node) {
        this.cubeSolutions = cubeSolutions;
        this.level = level;
        this.node = node;
    }

    boolean isFinal() {
        for (Cube cube : cubeSolutions){
            if (cube.getContent() == "$")
                return false;
        }
        ArrayList<Cube> mathematicalOperation = new ArrayList<Cube>();
        ArrayList<Boolean> cubeVisit = new ArrayList<Boolean>(Collections.nCopies(cubeSolutions.size(),false));
        for(int i=0; i<cubeSolutions.size(); i++){
            if (mathematicalOperation.isEmpty()
                    && cubeSolutions.get(i).getPosition().getX() == cubeSolutions.get(i+1).getPosition().getX()
                    && cubeSolutions.get(i).getPosition().getY() == cubeSolutions.get(i+1).getPosition().getY()-1
            ){
                mathematicalOperation.add(cubeSolutions.get(i));
                cubeVisit.set(i,true);
                mathematicalOperation.add(cubeSolutions.get(i+1));
                cubeVisit.set(i+1,true);
                i++;
                continue;
            }
            if(mathematicalOperation.get(mathematicalOperation.size()-1).getPosition().getX() == cubeSolutions.get(i).getPosition().getX()
                    && mathematicalOperation.get(mathematicalOperation.size()-1).getPosition().getY() == cubeSolutions.get(i).getPosition().getY()+1
            ){
                mathematicalOperation.add(cubeSolutions.get(i));
                cubeVisit.set(i,true);
            }else {
                if (checkMathematicalOperation(mathematicalOperation)){
                    mathematicalOperation.clear();
                    continue;
                } else {
                    return false;
                }
            }
        }
        for(int i=0; i<cubeSolutions.size(); i++){
            if (cubeVisit.get(i) == false && mathematicalOperation.isEmpty()){
                mathematicalOperation.add(cubeSolutions.get(i));
                cubeVisit.set(i,true);
            }
            if(mathematicalOperation.get(mathematicalOperation.size()-1).getPosition().getY() == cubeSolutions.get(i).getPosition().getY()
                    && mathematicalOperation.get(mathematicalOperation.size()-1).getPosition().getX() == cubeSolutions.get(i).getPosition().getX()-1
            ){
                mathematicalOperation.add(cubeSolutions.get(i));
                cubeVisit.set(i,true);
            }
        }
        if (checkMathematicalOperation(mathematicalOperation)){
            mathematicalOperation.clear();
            return true;
        } else {
            return false;
        }
    }

    boolean checkMathematicalOperation (ArrayList<Cube> cubes){
        return false;
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
        return new State(copySolutions, copyLevel, node.deepCopy());
    }

    boolean equal(State state) {
        if (state.hashState.equals(hashState) && state.node.getParent().hashState.equals(node.getParent().hashState))
            return true;
        else
            return false;
    }

    void findSolutions() {
        for (Cube[] cubes : level) {
            for (Cube cube : cubes) {
                hashState = hashState.concat(cube.getContent());
                if (cube.isGoalNode()) {
                    cubeSolutions.add(cube);
                }
            }
        }
    }

     void print(){
        for (Cube[] cubes : level) {
            for (Cube cube : cubes) {
                System.out.print(" " + cube.getContent() + " ");
            }
            System.out.println("");
        }
    }
}
