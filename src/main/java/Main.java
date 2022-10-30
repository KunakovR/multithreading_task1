public class Main {
    public static void main(String[] args) {

        System.out.println("Создаю потоки!..");

        ThreadGroup mainGroup = new ThreadGroup("Главная группа");

        MyThread thread1 = new MyThread(mainGroup, "Поток1");
        MyThread thread2 = new MyThread(mainGroup, "Поток2");
        MyThread thread3 = new MyThread(mainGroup, "Поток3");
        MyThread thread4 = new MyThread(mainGroup, "Поток4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException err) {
            err.printStackTrace();
        }

        System.out.println("Завершаю все потоки...");
        mainGroup.interrupt();



    }
}
