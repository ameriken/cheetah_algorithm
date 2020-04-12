package friends_score;



import java.util.ArrayList;
import java.util.Arrays;

class FriendsScore {
    public int highestScore(String[] friends) {
        int ans = 0;
        int n = friends[0].length();

        for (int i =0; i<n; i++) {
            int cnt=0;
            for(int k=0; k<n; k++) {
                if(i==k) continue;
                if(friends[i].charAt(k) == 'Y') {
                    cnt++;
                } else {
                    for(int m=0; m<n; m++) {
                        if(friends[k].charAt(m) == 'Y'
                                && friends[m].charAt(i) == 'Y') {
                            cnt++;
                            break;
                        }
                    }
                }
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}

