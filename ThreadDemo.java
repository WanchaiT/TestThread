import java.util.concurrent.*;
public class ThreadDemo {
    public static void main(String[] args) {
//ExecutorService executor = Executors.newCachedThreadPool();
// try changing parameter from 3 to 1 and see what happen
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(new ThreadPrintChar('a',100));
        executor.execute(new ThreadPrintChar('B',100));
        executor.execute(new ThreadPrintNum(100));
        executor.shutdown();
        
    }
}
