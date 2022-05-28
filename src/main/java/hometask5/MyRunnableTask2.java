package hometask5;

public class MyRunnableTask2 implements  Runnable{

    @Override
    public void run() {
        final int SIZE = 10000000;
        float[] arr = new float[SIZE];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        long startTime = System.currentTimeMillis();

         int[] leftHalf = new int [5000000];
         int[] rightHalf = new int [5000000];
        System.arraycopy(arr,0,leftHalf,0,5000000);
          System.arraycopy(arr,5000000,rightHalf,0,5000000);
        System.out.println(rightHalf);



        System.out.println("Two thread time: " + (System.currentTimeMillis()-startTime) + "ms. "  );

    }
    }

