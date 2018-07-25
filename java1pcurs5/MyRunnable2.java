import java.util.*;
import java.util.concurrent.locks.*;

public class MyRunnable2 implements Runnable {
    int x;
    int sum;
    Random r = new Random();
    
    ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    
    @Override
    public void run() {
        changeX();
        readX();
    }
    
    public void changeX() {
        rwLock.writeLock().lock();
        x = r.nextInt();
        rwLock.writeLock().unlock();
    }
    
    public void readX() {
        rwLock.readLock().lock();
        sum += x;
        rwLock.readLock().unlock();
    }
}