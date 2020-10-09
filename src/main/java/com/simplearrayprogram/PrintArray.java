package com.simplearrayprogram;

public class PrintArray<T> {
    T[] myArray;
    public PrintArray(T[] myArray){
        this.myArray = myArray;
    }

    public static void main(String[] args){
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = { 1.1 , 2.2 , 3.3 , 4.4};
        Character[] CharArray = {'H','E','L','L','O'};

        new PrintArray<Integer>(intArray).toPrint();
        new PrintArray<Double>(doubleArray).toPrint();
        new PrintArray<Character>(CharArray).toPrint();

    }

    private void toPrint() {
        toPrint(this.myArray);
    }

    public static <E> void toPrint(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }
}
