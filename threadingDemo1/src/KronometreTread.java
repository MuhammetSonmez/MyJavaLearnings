public class KronometreTread implements Runnable {

    private Thread thread;
    private String threadName;
    public KronometreTread(String threadName){
        this.threadName = threadName;
        System.out.println("Olusturuluyor : " + threadName);

    }

    @Override
    public void run() {
        System.out.println("Calistiriliyor : " + threadName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Kesildi");
        }
        System.out.println("Thread bitti " + threadName);
    }


        public void start(){
            System.out.println("Thread nesnesi olusuyor");
            if (thread == null){
                thread = new Thread(this, threadName);
                thread.start();
            }
            else {
                thread.start();
            }
        }






}
