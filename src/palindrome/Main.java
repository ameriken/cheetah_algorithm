package palindrome;

import kiwi.KiwiJuiceEasyP3;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        //String s = "abdfhdyrbdbsdfghjkllkjihgfds";
        String s = "ywerty";
        //String s = "abacaba";
        ThePalindrome palindrome = new ThePalindrome();
        System.out.println(palindrome.find(s));
    }
}

