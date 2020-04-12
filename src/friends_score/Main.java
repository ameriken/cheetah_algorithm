package friends_score;


import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //コード

        String[] friends = {
                "NYY",
                "YNY",
                "NYN"
        };
        FriendsScore friends_score = new FriendsScore();
        System.out.println(friends_score.highestScore(friends));
    }
}

