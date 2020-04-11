package interesting_party;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //コード
        String[] first  = {"fishing", "gardening", "swimming", "fishing"};
        String[] second = {"hunting", "fishing", "fishing", "biting"};

        //InterestingParty interesting_party = new InterestingParty();
        InterestingPartyP2 interesting_party = new InterestingPartyP2();
        System.out.println(interesting_party.bestInvitation(first, second));
    }
}

