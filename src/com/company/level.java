package com.company;

public class level {

    //#=wall b=normal cell r=result cell
    public node get_Level1( node node1) {

        node1.board[0][1] = '#';
        node1.board[0][2] = '#';
        node1.board[0][3] = '#';

        node1.board[1][0] = '#';
        node1.board[1][1] = '#';
        node1.board[1][2] = 'b';
        node1.board[1][3] = '#';
        node1.board[1][4] = '#';

        node1.board[2][0] = '#';
        node1.board[2][1] = 'r';
        node1.board[2][2] = 'r';
        node1.board[2][3] = 'r';
        node1.board[2][4] = '#';

        node1.board[3][0] = '#';
        node1.board[3][1] = '#';
        node1.board[3][2] = '#';
        node1.board[3][3] = '#';
        node1.board[3][4] = '#';

        node1.cubes.add(new cube("=",2,3,true));
        node1.cubes.add(new cube("1",3,2,true));
        node1.cubes.add(new cube("1",3,4,true));

        return node1;
    }
}
