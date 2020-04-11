package kiwi;

// 応用技
// TIPS1: 分岐を極力減らす

public class KiwiJuiceEasyP2 {
    int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        for (int i =0; i < fromId.length; i++) {
            int f = fromId[i];
            int t = toId[i];
            int vol = Math.min(bottles[f], capacities[t] - bottles[t]);
            bottles[f] -= vol;
            bottles[t] += vol;
        }
        return bottles;
    }
}
