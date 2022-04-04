package org.example;

import static org.example.ArrayDescription.myt;

public class ArrayApp3 {

    public static void main(String[] args) {
        try {
            myt();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }}
