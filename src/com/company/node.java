package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class node {

    char[][] board = new char[6][9];
    ArrayList<cube> cubes ;

    public void print_Node (){
        Collections.sort(cubes , new RowComp());
        for (cube c:cubes){
            System.out.println(c.position.getKey());
        }
    }
}
