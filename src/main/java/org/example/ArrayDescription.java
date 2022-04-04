package org.example;

public class ArrayDescription extends MyArraySizeException {
    public static void myt() {
        String [] [] aArray = new String[4][4];
        aArray = new String[][]{
                {"a", "d", "c", "f"},
                {"d", "f", "s", "h"},
                {"g", "g", "f", "d"},
                {"w", "a", "w", "m"},
        };


        for (int i = 0; i < aArray.length; i++)
        {
            for (int j = 0; j < aArray[i].length; j++)

                System.out.println(aArray[i][j] + "   ");
            if (i>aArray.length) {
                throw new MyArraySizeException("Number is not correct");
            }


        }
        int bArray[][] = new int[4][4];
        for (int i = 0; i < aArray.length; i++)
        {
            for (int j = 0; j < aArray[i].length; j++)
                bArray[i][j] = Integer.parseInt(aArray[i][j]);
            System.out.println(bArray);

    }}}

