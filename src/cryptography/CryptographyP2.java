package cryptography;


import java.util.*;

class CryptographyP2 {
    public long encrypt(int[] numbers) {
        long ret = 1;
        Arrays.sort(numbers);
        numbers[0]++;
        for (int i = 0; i < numbers.length; i++)  {
            ret *= numbers[i];
        }
        return ret;
    }
}

