package maze_maker;

import kiwi.KiwiJuiceEasyP3;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //コード
        String[] maze = {
                "...",
                "...",
                "..."
        };

        int startRow= 0;
        int startCol= 1;
        int[] moveRow = {1, 0, -1, 0};
        int[] moveCol = {0, 1, 0, -1};

        MazeMaker maze_maker = new MazeMaker();
        System.out.println(maze_maker.longestPath(maze, startRow, startCol, moveRow, moveCol));
    }
}

