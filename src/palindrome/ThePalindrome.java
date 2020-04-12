package palindrome;

public class ThePalindrome {
    public int find(String s) {
        for(int i = s.length(); ; i++) {
            boolean flag = true;
            for(int k =0; k < s.length(); k++) {
                // 反対側の文字が存在し、尚且つ違う文字であれば
                // フラグを折る
                System.out.println("k= "+k);
                System.out.println("i= "+i);
                if( (i - k - 1) < s.length()
                        && s.charAt(k) != s.charAt(i - k -1)) {
                    flag = false;
                    break;

                }
            }
            if (flag) return i;

        }

    }
}
