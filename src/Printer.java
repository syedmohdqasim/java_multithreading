import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Semaphore;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Printer extends Thread {
    private int remainder;
    static Semaphore lock= new Semaphore(1);

    Printer(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        try {
            printN();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void printN() throws InterruptedException {
        int i = 1;
        while (true) {
            lock.acquire();
            if (i % 2 == remainder) {
                System.out.println(i + "by" + remainder);
            }
            i++;
            lock.release();
        }
    }
}
