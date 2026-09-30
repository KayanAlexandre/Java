public class ExemploEstados {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new MinhaTarefa(), "worker");

        System.out.println(thread.getState());
        thread.start();

        Thread.sleep(100);
        System.out.println(thread.getState());

        thread.join();
        System.out.println(thread.getState());
    }
}