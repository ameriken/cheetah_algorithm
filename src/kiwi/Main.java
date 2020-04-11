package kiwi;

import java.util.*;

class Main {
    public static void main(String[] args) {
        //コード
        int[] capacities = {20, 20};
        int[] bottles = {5, 8};
        int[] formId = {0};
        int[] toId = {1};

        //KiwiJuiceEasy kiwi = new KiwiJuiceEasy();
        //KiwiJuiceEasyP2 kiwi = new KiwiJuiceEasyP2();
        KiwiJuiceEasyP3 kiwi = new KiwiJuiceEasyP3();
        System.out.println(Arrays.toString(kiwi.thePouring(capacities,bottles, formId, toId)));
    }
}

