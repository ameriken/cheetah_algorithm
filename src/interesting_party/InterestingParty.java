package interesting_party;


class InterestingParty {
    public int bestInvitation(String[] first, String[] second) {

        int i, k;
        int ans = 0;
        for (i=0; i < first.length; i++) {
            int f = 0;
            int s = 0;
            for (k =0; k < first.length; k++) {
                if(  first[i].equals( first[k])) f++;
                if(  first[i].equals(second[k])) f++;
                if( second[i].equals( first[k])) s++;
                if( second[i].equals(second[k])) s++;
                // デバックコード
                //System.out.println("f = "+f);
                //System.out.println("s = "+s);
            }
            ans = Math.max(f, ans);
            ans = Math.max(s, ans);
        }
        return ans;

    }
}

