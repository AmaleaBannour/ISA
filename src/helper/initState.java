package helper;

public class initState {
    // #: wall , $: goal cube , ' ': empty cube, otherwise all is number
    public static Node[][] level1 = {
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
    public static Node[][] level2 = {
            //Line 1
            {
                    new Node("#", 1, 1, false, false),
                    new Node("#", 1, 2, false, false),
                    new Node("#", 1, 3, false, false),
                    new Node("#", 1, 4, false, false),
                    new Node("#", 1, 5, false, false),
                    new Node("#", 1, 6, false, false),
                    new Node("#", 1, 7, false, false),
            },
            //Line 2
            {
                    new Node("#", 2, 1, false, false),
                    new Node("4", 2, 2, true, false),
                    new Node("$", 2, 3, false, true),
                    new Node("$", 2, 4, false, true),
                    new Node("$", 2, 5, false, true),
                    new Node("4", 2, 6, true, false),
                    new Node("#", 2, 7, false, false),
            },
            //Line 3
            {
                    new Node("#", 3, 1, false, false),
                    new Node("#", 3, 2, false, false),
                    new Node("#", 3, 3, false, false),
                    new Node("=", 3, 4, true, false),
                    new Node("#", 3, 5, false, false),
                    new Node("#", 3, 6, false, false),
                    new Node("#", 3, 7, false, false),
            },
            //Line 4
            {
                    new Node("#", 4, 1, false, false),
                    new Node("#", 4, 2, false, false),
                    new Node("#", 4, 3, false, false),
                    new Node("#", 4, 4, false, false),
                    new Node("#", 4, 5, false, false),
                    new Node("#", 4, 6, false, false),
                    new Node("#", 4, 7, false, false),
            },
    };
    public static Node[][] level3 = {
            //Line 1
            {
                    new Node("#", 1, 1, false, false),
                    new Node("#", 1, 2, false, false),
                    new Node("#", 1, 3, false, false),
                    new Node("#", 1, 4, false, false),
                    new Node("#", 1, 5, false, false),
                    new Node("#", 1, 6, false, false),
                    new Node("#", 1, 7, false, false),
                    new Node("#", 1, 8, false, false),
            },
            //Line 2
            {
                    new Node("#", 2, 1, false, false),
                    new Node("$", 2, 2, false, true),
                    new Node("$", 2, 3, false, true),
                    new Node("1", 2, 4, false, true),
                    new Node("$", 2, 5, false, true),
                    new Node("$", 2, 6, false, true),
                    new Node("3", 2, 7, true, false),
                    new Node("#", 2, 8, false, false),
            },
            //Line 3
            {
                    new Node("#", 3, 1, false, false),
                    new Node("2", 3, 2, true, false),
                    new Node("+", 3, 3, true, false),
                    new Node("#", 3, 4, false, false),
                    new Node("=", 3, 5, true, false),
                    new Node("#", 3, 6, false, false),
                    new Node("#", 3, 7, false, false),
                    new Node("#", 3, 8, false, false),
            },
            //Line 4
            {
                    new Node("#", 4, 1, false, false),
                    new Node("#", 4, 2, false, false),
                    new Node("#", 4, 3, false, false),
                    new Node("#", 4, 4, false, false),
                    new Node("#", 4, 5, false, false),
                    new Node("#", 4, 6, false, false),
                    new Node("#", 4, 7, false, false),
                    new Node("#", 4, 8, false, false),
            },
    };
    public static Node[][] level4 = {
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
                    new Node("1", 2, 3, true, true),
                    new Node("#", 2, 4, false, false),
                    new Node("#", 2, 5, false, false),
            },
            //Line 3
            {
                    new Node("#", 3, 1, false, false),
                    new Node("2", 3, 2, true, true),
                    new Node("2", 3, 3, true, true),
                    new Node("1", 3, 4, true, true),
                    new Node("#", 3, 5, false, false),
            },
            //Line 4
            {
                    new Node("#", 4, 1, false, false),
                    new Node("#", 4, 2, false, false),
                    new Node("=", 4, 3, true, true),
                    new Node(" ", 4, 4, false, false),
                    new Node("#", 4, 5, false, false),
            },
            //Line 5
            {
                    new Node("#", 5, 1, false, false),
                    new Node("#", 5, 2, false, false),
                    new Node("#", 5, 3, false, false),
                    new Node("#", 5, 4, false, false),
                    new Node("#", 5, 5, false, false),
            },
    };
    public static Node[][] level5 = {
            //Line 1
            {
                    new Node("#", 1, 1, false, false),
                    new Node("#", 1, 2, false, false),
                    new Node("#", 1, 3, false, false),
                    new Node("#", 1, 4, false, false),
                    new Node("#", 1, 5, false, false),
                    new Node("#", 1, 6, false, false),
                    new Node("#", 1, 7, false, false),
                    new Node("#", 1, 8, false, false),
                    new Node("#", 1, 9, false, false),
            },
            //Line 2
            {
                    new Node("#", 2, 1, false, false),
                    new Node("+", 2, 2, true, true),
                    new Node("$", 2, 3, false, true),
                    new Node("$", 2, 4, false, true),
                    new Node("$", 2, 5, false, true),
                    new Node("=", 2, 6, true, true),
                    new Node("2", 2, 7, true, false),
                    new Node("1", 2, 8, true, false),
                    new Node("#", 2, 9, false, false),
            },
            //Line 3
            {
                    new Node("#", 3, 1, false, false),
                    new Node("3", 3, 2, true, false),
                    new Node("#", 3, 3, false, false),
                    new Node("#", 3, 4, false, false),
                    new Node(" ", 3, 5, false, false),
                    new Node("#", 3, 6, false, false),
                    new Node("#", 3, 7, false, false),
                    new Node("#", 3, 8, false, false),
                    new Node("#", 3, 9, false, false),
            },
            //Line 4
            {
                    new Node("#", 4, 1, false, false),
                    new Node("#", 4, 2, false, false),
                    new Node("#", 4, 3, false, false),
                    new Node("#", 4, 4, false, false),
                    new Node("#", 4, 5, false, false),
                    new Node("#", 4, 6, false, false),
                    new Node("#", 4, 7, false, false),
                    new Node("#", 4, 8, false, false),
                    new Node("#", 4, 9, false, false),
            },
    };
}
