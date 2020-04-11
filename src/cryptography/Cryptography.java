package cryptography;


class Cryptography {
    public long encrypt(int[] numbers) {

        long ans = 0;

        for(int i =0; i < numbers.length; i++) {
            long seki=1;
            for(int k =0; k < numbers.length; k++) {
                if(i == k) {
                    seki *= (numbers[k] + 1);
                } else {
                    seki *= numbers[k];
                }
            }
            ans = Math.max(ans, seki);
        }
        return ans;

    }
}

