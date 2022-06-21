package hometask5;

public class HOmetask5_2 {

           public static void main(String[] args) {
           Thread thread1 = new Thread(new MyRunnableTask());
            Thread thread2 = new Thread(new MyRunnableTask());
            thread1.start();
               try {
                   thread1.join(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               thread2.start();
               try {
                   thread2.join(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }}



