package helper;

import javafx.geometry.Pos;

import java.util.ArrayList;

public class initState {
    // #: wall , $: goal cube , ' ': empty cube, otherwise all is number
    public static Node[][] leve1 = {
            //Line 1
            {
                    new Node("#", 1, 1, false, false),
                    new Node("#", 1, 2, false, false),
                    new Node("#", 1, 3, false, false),
                    new Node("#", 1, 4, false, false),
                    new Node("#", 1, 5, false, false),
            },
            //Line 2
            {
                    new Node("#", 2, 1, false, false),
                    new Node("#", 2, 2, false, false),
                    new Node("=", 2, 3, true, false),
                    new Node("#", 2, 4, false, false),
                    new Node("#", 2, 5, false, false),
            },
            //Line 3
            {
                    new Node("#", 3, 1, false, false),
                    new Node("1", 3, 2, true, true),
                    new Node("$", 3, 3, false, true),
                    new Node("1", 3, 4, true, true),
                    new Node("#", 3, 5, false, false),
            },
            //Line 4
            {
                    new Node("#", 4, 1, false, false),
                    new Node("#", 4, 2, false, false),
                    new Node("#", 4, 3, false, false),
                    new Node("#", 4, 4, false, false),
                    new Node("#", 4, 5, false, false)
            },
    };
}
