class ThreadPrintChar extends Thread{

    private char charToPrint;
    private int times;
    public ThreadPrintChar(char c, int t){
        charToPrint = c;
        times = t;
    }
    /*public void run(){
        for(int i=0;i<times;++i){
            System.out.print(charToPrint);
        }
    }
*/
    public void run(){
        try{
            for(int i=0;i<times;++i){
                System.out.print(charToPrint);
                Thread.sleep(1);
            }
        }catch(InterruptedException ex){
        }
    }
}
