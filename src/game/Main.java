package game;

import helper.initState;

public class Main {
    public static void main(String[] args) {
        State s = new State(initState.level1);
        System.out.println(s.cubeSolutions.get(0));

//        State state  = new State();
//        Logic logic = new Logic();
//        boolean trueInput = true;
//        int chosenNumber ;
//
//        System.out.println("Choose a level from 1 to 10 to start playing :");
//        System.out.println("Level 1");
//        State.print(initState.level1);
//        System.out.println("Level 2");
//        State.print(initState.level2);
//        System.out.println("Level 3");
//        State.print(initState.level3);
//        System.out.println("Level 4");
//        State.print(initState.level4);
//        System.out.println("Level 5");
//        State.print(initState.level5);
//        System.out.println("Level 6");
//        State.print(initState.level6);
//        System.out.println("Level 7");
//        State.print(initState.level7);
//        System.out.println("Level 8");
//        State.print(initState.level8);
//        System.out.println("Level 9");
//        State.print(initState.level9);
//        System.out.println("Level 10");
//        State.print(initState.level10);
//
//        while (trueInput){
//
//            chosenNumber = initState.scanner.nextInt();
//
//            switch (chosenNumber) {
//                case 1:
//                    state = new State(initState.level1);
//                    break;
//                case 2:
//                    state = new State(initState.level2);
//                    break;
//                case 3:
//                    state = new State(initState.level3);
//                    break;
//                case 4:
//                    state = new State(initState.level4);
//                    break;
//                case 5:
//                    state = new State(initState.level5);
//                    break;
//                case 6:
//                    state = new State(initState.level6);
//                    break;
//                case 7:
//                    state = new State(initState.level7);
//                    break;
//                case 8:
//                    state = new State(initState.level8);
//                    break;
//                case 9:
//                    state = new State(initState.level9);
//                    break;
//                case 10:
//                    state = new State(initState.level10);
//                    break;
//                default:
//                    System.out.println("There are only ten levels." + "\n" + "Please try again.");
//                    continue;
//            }
//
//            trueInput = false;
//
//        }
//
//        trueInput = true;
//
//        System.out.println("Choose a algorithm of playing : " + "\n"
//                + "1 ---> to try it yourself " + "\n"
//                + "2 ---> to BFS algorithm " + "\n"
//                + "3 ---> to DFS algorithm " + "\n"
//                + "4 ---> to UCS algorithm " + "\n"
//        );
//
//        while (trueInput){
//
//            chosenNumber = initState.scanner.nextInt();
//
//            switch (chosenNumber) {
//                case 1:
//                    logic.userPlay(state);
//                    break;
//                case 2:
//                    logic.userPlay(state);
//                    break;
//                case 3:
//                    logic.userPlay(state);
//                    break;
//                case 4:
//                    logic.userPlay(state);
//                    break;
//                default:
//                    System.out.println("Please choose from the above algorithms");
//                    continue;
//            }
//
//            trueInput = false;
//
//        }
    }
}
