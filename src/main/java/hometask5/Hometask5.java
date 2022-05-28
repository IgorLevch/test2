package hometask5;

public class Hometask5 {
    public static void main(String[] args) {
        firstMethod();;
    }

        public static void firstMethod() {

        final int SIZE = 10000000;
        float[] arr = new float[SIZE];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }

        long startTime = System.currentTimeMillis();
        for ( i = 0; i <arr.length ; i++) {


            arr[i] = (float) ((float) (arr[i]) * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
            System.out.println("One thread time: " + (System.currentTimeMillis()-startTime) + "ms. "  );

        }



 }
