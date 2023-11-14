package helper;

import java.util.Scanner;

public class initState {
    public static Scanner scanner = new Scanner(System.in);

    // #: wall , $: goal cube , ' ': empty cube, otherwise all is number
    public static Cube[][] level1 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("#", 2, 2, false, false),
                    new Cube("=", 2, 3, true, false),
                    new Cube("#", 2, 4, false, false),
                    new Cube("#", 2, 5, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("1", 3, 2, true, true),
                    new Cube("$", 3, 3, false, true),
                    new Cube("1", 3, 4, true, true),
                    new Cube("#", 3, 5, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("#", 4, 2, false, false),
                    new Cube("#", 4, 3, false, false),
                    new Cube("#", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false)
            },
    };
    public static Cube[][] level2 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
                    new Cube("#", 1, 6, false, false),
                    new Cube("#", 1, 7, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("4", 2, 2, true, false),
                    new Cube("$", 2, 3, false, true),
                    new Cube("$", 2, 4, false, true),
                    new Cube("$", 2, 5, false, true),
                    new Cube("4", 2, 6, true, false),
                    new Cube("#", 2, 7, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("#", 3, 2, false, false),
                    new Cube("#", 3, 3, false, false),
                    new Cube("=", 3, 4, true, false),
                    new Cube("#", 3, 5, false, false),
                    new Cube("#", 3, 6, false, false),
                    new Cube("#", 3, 7, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("#", 4, 2, false, false),
                    new Cube("#", 4, 3, false, false),
                    new Cube("#", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false),
                    new Cube("#", 4, 6, false, false),
                    new Cube("#", 4, 7, false, false),
            },
    };
    public static Cube[][] level3 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
                    new Cube("#", 1, 6, false, false),
                    new Cube("#", 1, 7, false, false),
                    new Cube("#", 1, 8, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("$", 2, 2, false, true),
                    new Cube("$", 2, 3, false, true),
                    new Cube("1", 2, 4, false, true),
                    new Cube("$", 2, 5, false, true),
                    new Cube("$", 2, 6, false, true),
                    new Cube("3", 2, 7, true, false),
                    new Cube("#", 2, 8, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("2", 3, 2, true, false),
                    new Cube("+", 3, 3, true, false),
                    new Cube("#", 3, 4, false, false),
                    new Cube("=", 3, 5, true, false),
                    new Cube("#", 3, 6, false, false),
                    new Cube("#", 3, 7, false, false),
                    new Cube("#", 3, 8, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("#", 4, 2, false, false),
                    new Cube("#", 4, 3, false, false),
                    new Cube("#", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false),
                    new Cube("#", 4, 6, false, false),
                    new Cube("#", 4, 7, false, false),
                    new Cube("#", 4, 8, false, false),
            },
    };
    public static Cube[][] level4 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("#", 2, 2, false, false),
                    new Cube("1", 2, 3, true, true),
                    new Cube("#", 2, 4, false, false),
                    new Cube("#", 2, 5, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("2", 3, 2, true, true),
                    new Cube("2", 3, 3, true, true),
                    new Cube("1", 3, 4, true, true),
                    new Cube("#", 3, 5, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("#", 4, 2, false, false),
                    new Cube("=", 4, 3, true, true),
                    new Cube(" ", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false),
            },
            //Line 5
            {
                    new Cube("#", 5, 1, false, false),
                    new Cube("#", 5, 2, false, false),
                    new Cube("#", 5, 3, false, false),
                    new Cube("#", 5, 4, false, false),
                    new Cube("#", 5, 5, false, false),
            },
    };
    public static Cube[][] level5 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
                    new Cube("#", 1, 6, false, false),
                    new Cube("#", 1, 7, false, false),
                    new Cube("#", 1, 8, false, false),
                    new Cube("#", 1, 9, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("+", 2, 2, true, true),
                    new Cube("$", 2, 3, false, true),
                    new Cube("$", 2, 4, false, true),
                    new Cube("$", 2, 5, false, true),
                    new Cube("=", 2, 6, true, true),
                    new Cube("2", 2, 7, true, false),
                    new Cube("1", 2, 8, true, false),
                    new Cube("#", 2, 9, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("3", 3, 2, true, false),
                    new Cube("#", 3, 3, false, false),
                    new Cube("#", 3, 4, false, false),
                    new Cube(" ", 3, 5, false, false),
                    new Cube("#", 3, 6, false, false),
                    new Cube("#", 3, 7, false, false),
                    new Cube("#", 3, 8, false, false),
                    new Cube("#", 3, 9, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("#", 4, 2, false, false),
                    new Cube("#", 4, 3, false, false),
                    new Cube("#", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false),
                    new Cube("#", 4, 6, false, false),
                    new Cube("#", 4, 7, false, false),
                    new Cube("#", 4, 8, false, false),
                    new Cube("#", 4, 9, false, false),
            },
    };
    public static Cube[][] level6 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("=", 2, 2, true, false),
                    new Cube("#", 2, 3, false, false),
                    new Cube("#", 2, 4, false, false),
                    new Cube("#", 2, 5, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("3", 3, 2, true, false),
                    new Cube(" ", 3, 3, false, false),
                    new Cube(" ", 3, 4, false, false),
                    new Cube("#", 3, 5, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("3", 4, 2, true, false),
                    new Cube("#", 4, 3, false, false),
                    new Cube(" ", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false),
            },
            //Line 5
            {
                    new Cube("#", 5, 1, false, false),
                    new Cube("$", 5, 2, false, true),
                    new Cube("$", 5, 3, false, true),
                    new Cube("$", 5, 4, false, true),
                    new Cube("#", 5, 5, false, false),
            },
            //Line 6
            {
                    new Cube("#", 6, 1, false, false),
                    new Cube("#", 6, 2, false, false),
                    new Cube("#", 6, 3, false, false),
                    new Cube("#", 6, 4, false, false),
                    new Cube("#", 6, 5, false, false),
            },
    };
    public static Cube[][] level7 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
                    new Cube("#", 1, 6, false, false),
                    new Cube("#", 1, 7, false, false),
                    new Cube("#", 1, 8, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("2", 2, 2, true, true),
                    new Cube(" ", 2, 3, false, false),
                    new Cube(" ", 2, 4, false, false),
                    new Cube("$", 2, 5, false, true),
                    new Cube("$", 2, 6, false, true),
                    new Cube("2", 2, 7, false, true),
                    new Cube("#", 2, 8, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("1", 3, 2, true, true),
                    new Cube("#", 3, 3, false, false),
                    new Cube(" ", 3, 4, false, false),
                    new Cube("#", 3, 5, false, false),
                    new Cube("#", 3, 6, false, false),
                    new Cube("=", 3, 7, true, false),
                    new Cube("#", 3, 8, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("=", 4, 2, true, false),
                    new Cube("#", 4, 3, false, false),
                    new Cube(" ", 4, 4, false, false),
                    new Cube(" ", 4, 5, false, false),
                    new Cube(" ", 4, 6, false, false),
                    new Cube("1", 4, 7, true, false),
                    new Cube("#", 4, 8, false, false),
            },
            //Line 5
            {
                    new Cube("#", 5, 1, false, false),
                    new Cube("#", 5, 2, false, false),
                    new Cube("#", 5, 3, false, false),
                    new Cube("#", 5, 4, false, false),
                    new Cube("#", 5, 5, false, false),
                    new Cube("#", 5, 6, false, false),
                    new Cube("#", 5, 7, false, false),
                    new Cube("#", 5, 8, false, false),
            },
    };
    public static Cube[][] level8 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
                    new Cube("#", 1, 6, false, false),
                    new Cube("#", 1, 7, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("#", 2, 2, false, false),
                    new Cube(" ", 2, 3, false, false),
                    new Cube(" ", 2, 4, false, false),
                    new Cube(" ", 2, 5, false, false),
                    new Cube("#", 2, 6, false, false),
                    new Cube("#", 2, 7, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("-", 3, 2, true, true),
                    new Cube("1", 3, 3, true, true),
                    new Cube("$", 3, 4, false, true),
                    new Cube("$", 3, 5, false, true),
                    new Cube("3", 3, 6, false, true),
                    new Cube("#", 3, 7, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("#", 4, 2, false, false),
                    new Cube("4", 4, 3, true, false),
                    new Cube(" ", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false),
                    new Cube("#", 4, 6, false, false),
                    new Cube("#", 4, 7, false, false),
            },
            //Line 5
            {
                    new Cube("#", 5, 1, false, false),
                    new Cube("#", 5, 2, false, false),
                    new Cube("=", 5, 3, true, false),
                    new Cube("#", 5, 4, false, false),
                    new Cube("#", 5, 5, false, false),
                    new Cube("#", 5, 6, false, false),
                    new Cube("#", 5, 7, false, false),
            },
            //Line 6
            {
                    new Cube("#", 6, 1, false, false),
                    new Cube("#", 6, 2, false, false),
                    new Cube("#", 6, 3, false, false),
                    new Cube("#", 6, 4, false, false),
                    new Cube("#", 6, 5, false, false),
                    new Cube("#", 6, 6, false, false),
                    new Cube("#", 6, 7, false, false),
            },
    };
    public static Cube[][] level9 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
                    new Cube("#", 1, 6, false, false),
                    new Cube("#", 1, 7, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("8", 2, 2, false, true),
                    new Cube("3", 2, 3, true, true),
                    new Cube("+", 2, 4, true, true),
                    new Cube("=", 2, 5, true, true),
                    new Cube("5", 2, 6, true, true),
                    new Cube("#", 2, 7, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("#", 3, 2, false, false),
                    new Cube("=", 3, 3, true, false),
                    new Cube("$", 3, 4, false, true),
                    new Cube("3", 3, 5, true, true),
                    new Cube("3", 3, 6, false, true),
                    new Cube("#", 3, 7, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("#", 4, 2, false, false),
                    new Cube("#", 4, 3, false, false),
                    new Cube("#", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false),
                    new Cube("#", 4, 6, false, false),
                    new Cube("#", 4, 7, false, false),
            },
    };
    public static Cube[][] level10 = {
            //Line 1
            {
                    new Cube("#", 1, 1, false, false),
                    new Cube("#", 1, 2, false, false),
                    new Cube("#", 1, 3, false, false),
                    new Cube("#", 1, 4, false, false),
                    new Cube("#", 1, 5, false, false),
                    new Cube("#", 1, 6, false, false),
                    new Cube("#", 1, 7, false, false),
                    new Cube("#", 1, 8, false, false),
                    new Cube("#", 1, 9, false, false),
            },
            //Line 2
            {
                    new Cube("#", 2, 1, false, false),
                    new Cube("1", 2, 2, true, false),
                    new Cube(">", 2, 3, true, false),
                    new Cube("2", 2, 4, true, true),
                    new Cube(">", 2, 5, true, true),
                    new Cube("3", 2, 6, true, true),
                    new Cube("$", 2, 7, false, true),
                    new Cube("$", 2, 8, false, true),
                    new Cube("#", 2, 9, false, false),
            },
            //Line 3
            {
                    new Cube("#", 3, 1, false, false),
                    new Cube("#", 3, 2, false, false),
                    new Cube("#", 3, 3, false, false),
                    new Cube(" ", 3, 4, false, false),
                    new Cube(" ", 3, 5, false, false),
                    new Cube("#", 3, 6, false, false),
                    new Cube("#", 3, 7, false, false),
                    new Cube("#", 3, 8, false, false),
                    new Cube("#", 3, 9, false, false),
            },
            //Line 4
            {
                    new Cube("#", 4, 1, false, false),
                    new Cube("#", 4, 2, false, false),
                    new Cube("#", 4, 3, false, false),
                    new Cube("#", 4, 4, false, false),
                    new Cube("#", 4, 5, false, false),
                    new Cube("#", 4, 6, false, false),
                    new Cube("#", 4, 7, false, false),
                    new Cube("#", 4, 8, false, false),
                    new Cube("#", 4, 9, false, false),
            },
    };
}
