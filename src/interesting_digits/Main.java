package interesting_digits;


import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //コード
        int base = 4;

        //InterestingDigits interestingDigits = new InterestingDigits();
        InterestingDigitsP2 interestingDigits = new InterestingDigitsP2();
        System.out.println(Arrays.toString(interestingDigits.digits(base)));
    }
}

