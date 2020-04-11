package cryptography;


class Main {
    public static void main(String[] args) {
        //コード
        int[] numbers = {1, 2, 3};

        //InterestingParty interesting_party = new InterestingParty();
        //Cryptography cryptography = new Cryptography();
        CryptographyP2 cryptography = new CryptographyP2();
        System.out.println(cryptography.encrypt(numbers));
    }
}

