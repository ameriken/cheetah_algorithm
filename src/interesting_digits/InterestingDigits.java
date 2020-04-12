package interesting_digits;

//・ゴール
//指定の基数でかつ3桁までの数字の中で倍数を見つける
//
//具体例)
//例えば基数4の場合は下記の計算になる
//10進数で63までの数値で考える
//(3*4*4)+(3*4)+3 = 63
//4進数で考えると
//333
//となる
//
//基数が4であるため、可能性があるのは2か3となる
//1~63の数値を全て2で割る。終わったら3で割る
//また、4進数表記での全ての合計値を2で割る、終わったら3で割る。
//
//全部の調査の結果
//・指定の基数表記の数を10進数に変換し割り切れる数
//・全ての桁数を足して割り切れる数
//こちらが同じだった場合に倍数を取得できる。


import java.util.*;

class InterestingDigits {
    public int[] digits(int base) {

        ArrayList <Integer> v = new ArrayList<Integer>();

        for(int n = 2; n<base; n++) {
            boolean ok = true;
            for(int k1=0; k1<base; k1++) {
                for(int k2=0; k2<base; k2++) {
                    for(int k3=0; k3<base; k3++)  {
                        //デバックコード
                        //System.out.println("k1 = " + k1 + " k2 * base = " + k2*base +" k3*baase*base = "+k3*base*base);
                        // 10進数で割り切れる数+全ての桁数を足して割り切れる数 = 指定の基数で倍数を作る
                        if( (k1 + k2*base + k3*base*base) % n == 0
                                && (k1 + k2 + k3) % n != 0) {
                            ok = false;
                            break;
                        }
                    }
                    if(!ok) break;
                }
                if(!ok) break;
            }
            if(ok) v.add(n);
        }

        int[]  ans = new int[v.size()];
        for(int i=0; i<v.size(); i++) ans[i] = v.get(i);
        return ans;
    }
}

