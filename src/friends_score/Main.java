package friends_score;


import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //コード

        String[] friends = {
                "NYNNN",// 0
                "YNYNN",// 1
                "NYNYN",// 2
                "NNYNY",// 3
                "NNNYN" // 4
        };
        FriendsScore friends_score = new FriendsScore();
        System.out.println(friends_score.highestScore(friends));
    }
}

