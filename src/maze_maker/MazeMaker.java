package maze_maker;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MazeMaker {
    public int longestPath(String[] maze, int startRow, int startCol,
                           int[] moveRow, int[] moveCol) {
        int max = 0;
        int width = maze[0].length(), height = maze.length;
        // フィールド全体の大きさ
        int[][] board = new int[height][width];

        for (int i = 0; i < height; i++){
            for (int k = 0; k < width; k++) {
                board[i][k] = -1;
            }
            //System.out.println(Arrays.toString(board[i]));
        }

        //System.out.println("===");
        board[startRow][startCol] = 0;
        //System.out.println(Arrays.toString(board[0]));
        //System.out.println(Arrays.toString(board[1]));
        //System.out.println(Arrays.toString(board[2]));

        Queue<Integer> queueX = new LinkedList<Integer>();
        Queue<Integer> queueY = new LinkedList<Integer>();
        queueX.add(startCol); // 1
        queueY.add(startRow); // 0
        //System.out.println("!!!");
        //System.out.println(queueX);
        //System.out.println(queueY);


        while (!queueX.isEmpty()) {
            int x = queueX.poll(), y = queueY.poll();
            //System.out.println("uuuuuuuu");
            //System.out.println("x = "+ x);
            //System.out.println("y = "+ y);

            for (int i = 0; i < moveRow.length; i++) {
                int nextX = x + moveCol[i], nextY = y + moveRow[i];
                //System.out.println("----");
                //System.out.println("nextX = "+ nextX);
                //System.out.println("nextY = "+ nextY);


                //System.out.println(Arrays.toString(board[0]));
                //System.out.println(Arrays.toString(board[1]));
                //System.out.println(Arrays.toString(board[2]));
                if (0 <= nextX && nextX < width
                        && 0 <= nextY && nextY < height
                        && board[nextY][nextX] == -1
                        && maze[nextY].charAt(nextX) == '.') {
                    //System.out.println(board[y][x]);
                    board[nextY][nextX] = board[y][x] + 1;
                    queueX.add(nextX);
                    queueY.add(nextY);
                    //System.out.println("testes");
                    //System.out.println(queueX);
                    //System.out.println(queueY);
                    //System.out.println("kkkkkkkkkkk");
                    //System.out.println(Arrays.toString(board[0]));
                    //System.out.println(Arrays.toString(board[1]));
                    //System.out.println(Arrays.toString(board[2]));
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int k = 0; k < width; k++) {
                if (maze[i].charAt(k) == '.' && board[i][k] == -1) {
                    return -1;
                }
                max = Math.max(max, board[i][k]);
            }
        }
        return max;
    }
}
