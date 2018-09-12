import java.util.concurrent.*;
public class ThreadDemo {
    public static void main(String[] args) {
        /*ThreadPrintNum thread0 = new ThreadPrintNum(10);
        thread0.start();*/
        ThreadPrintChar thread1 = new ThreadPrintChar('A', 100);
        ThreadPrintChar thread2 = new ThreadPrintChar('B', 100);
        ThreadPrintNum thread3 = new ThreadPrintNum(100);

        //thread1.setPriority(5);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
