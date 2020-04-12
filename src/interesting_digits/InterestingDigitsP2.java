package interesting_digits;


import java.util.*;

class InterestingDigitsP2 {
    public int[] digits(int base) {
        Vector<Integer> v  = new Vector<Integer>();
        for(int i =2; i<base; i++) {
            if (((base-i) %i) ==0) v.add(i);
        }

        int[] ans = new int[v.size()];
        for(int i=0; i<v.size(); i++) ans[i] = v.get(i);
        return ans;

    }
}

