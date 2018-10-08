public class Ball {

    private String log;

    public Ball() {
        log = "";
    }

    //Removing the synchronized keyword will cause a race condition.
    public synchronized void kick(String aPlayerName) throws InterruptedException {
        notify();
        log += aPlayerName + " ";
        System.out.println(log);
        wait();
    }

    public String getLog() {
        return log;
    }

}