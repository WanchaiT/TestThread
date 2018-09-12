class ThreadPrintNum extends Thread{
    private int lastNum;
    public ThreadPrintNum(int n){
        lastNum = n;
    }
    public void run(){
        Thread thread4 = new Thread(new ThreadPrintChar('C' , 150));
        thread4.start();
        try {
            for(short i=0;i<lastNum;++i){
                System.out.print(i+" ");
                if(i == 50) thread4.join();
            }
        }catch (InterruptedException e) {

        }

    }
}
