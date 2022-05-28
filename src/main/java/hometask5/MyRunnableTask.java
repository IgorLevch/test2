package hometask5;

public class MyRunnableTask implements Runnable{

    @Override
    public void run() {
        final int SIZE = 10000000;
        float[] arr = new float[SIZE];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        long startTime = System.currentTimeMillis();

        int[] leftHalf = new int [5000000];int[] rightHalf = new int [5000000];
        System.arraycopy(arr,0,leftHalf,0,5000000);
       System.arraycopy(arr,5000000,rightHalf,0,5000000);
        System.out.println(leftHalf);

        int[] mergedArr = new int [10000000];
        System.arraycopy(leftHalf,0,mergedArr,0,5000000);
        System.arraycopy(rightHalf,0,mergedArr,5000000,5000000);
        System.out.println(mergedArr);



        System.out.println("Two thread time: " + (System.currentTimeMillis()-startTime) + "ms. "  );

    }

    }

