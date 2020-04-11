package interesting_digits;


import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //コード
        int base = 3;

        InterestingDigits interestingDigits = new InterestingDigits();
        System.out.println(Arrays.toString(interestingDigits.digits(base)));
    }
}

