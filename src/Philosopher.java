import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher {

    private Lock leftFork;
    private Lock rightFork;
    private String name;
    int stuffToEat;

    Philosopher(String n){
        name = n;
        leftFork = new ReentrantLock();
        rightFork = new ReentrantLock();
        stuffToEat = 5;
    }

    public void eat(){
        leftFork.lock();
        rightFork.lock();
        stuffToEat--;
        leftFork.unlock();
        rightFork.unlock();
    }


}
