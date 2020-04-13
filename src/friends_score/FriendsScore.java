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
                        //System.out.println("frinends[k] = " + friends[k].charAt(m));
                        //System.out.println("friends[m] = "+ friends[m].charAt(i));
                        //System.out.println("m = "+ m);
                        //System.out.println("i = "+ i);
                        //System.out.println("k = "+ k);
                        if(friends[k].charAt(m) == 'Y'
                                && friends[m].charAt(i) == 'Y') {
                            cnt++;
                            //System.out.println("break");
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

