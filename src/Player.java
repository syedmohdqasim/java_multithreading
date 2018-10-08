public class Player implements Runnable {

    private final String name;
    private final Ball ball;

    public Player(String aName, Ball aBall) {
        name = aName;
        ball = aBall;
    }

    @Override
    public void run() {
        while(true) {
            try {
                ball.kick(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}