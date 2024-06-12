package org.jscode.singleton;

public class TestSingleton {

    public static void main(String[] args) {

//        Player player = Player.getPlayer("first_player");
//        System.out.println(player);
//        Player player2 = Player.getPlayer("second_player");
//        System.out.println(player2);

        Thread threadPlayer = new Thread(new RunPlayer());
        Thread threadPlayer2 = new Thread(new RunPlayer2());

        threadPlayer.start();
        threadPlayer2.start();
    }

    static class RunPlayer implements Runnable{
        @Override
        public void run() {
            Player player = Player.getPlayer("first_player");
            System.out.println(player);
        }
    }

    static class RunPlayer2 implements Runnable{
        @Override
        public void run() {
            Player player = Player.getPlayer("second_player");
            System.out.println(player);
        }
    }
}
