package kiwi;

import java.util.*;



class Main {
    public static void main(String[] args) {
        //コード
        int[] capacities = {20, 20};
        int[] bottles = {5, 8};
        int[] formId = {0};
        int[] toId = {1};
        KiwiJuiceEasy kiwi = new KiwiJuiceEasy();
        kiwi.thePouring(capacities,bottles, formId, toId);
    }
}

