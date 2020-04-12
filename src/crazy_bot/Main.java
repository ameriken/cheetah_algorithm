package crazy_bot;



class Main {
    public static void main(String[] args) {
        //コード
        int n =2;
        int east  = 25;
        int west  = 25;
        int south = 25;
        int north = 25;

        CrazyBot crazyBot = new CrazyBot();
        System.out.println(crazyBot.getProbability(n, east, west, south, north));
    }
}

