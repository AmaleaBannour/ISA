package com.company;

import javafx.util.Pair;

import java.util.Comparator;

public class cube {

    char content;
    Pair< Integer , Integer > position;
    boolean moving;

    public cube(char content , int position_x , int position_y , boolean moving){

        this.content = content ;
        position = new Pair<Integer, Integer>(position_x,position_y);
        this.moving = moving;

    }

}


class RowComp implements Comparator<cube>{
    @Override
    public int compare(cube c1 , cube c2){
        if(c1.position.getKey() < c2.position.getKey()){
            return 1;
        } else {
            return -1;
        }
    }
}