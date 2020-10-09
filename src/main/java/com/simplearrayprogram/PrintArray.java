package com.simplearrayprogram;

public class PrintArray<X, Y, Z> {
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;

    public PrintArray(X[] myXArray, Y[] myYArray, Z[] myZArray){
        this.myXArray= myXArray;
        this.myYArray = myYArray;
        this.myZArray = myZArray;
    }

    public static void main(String[] args){
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = { 1.1 , 2.2 , 3.3 , 4.4};
        Character[] CharArray = {'H','E','L','L','O'};

        new PrintArray<Integer , Double,Character>(intArray,doubleArray,CharArray).toPrint();

    }

    private void toPrint() {
        toPrint(this.myXArray);
        toPrint(this.myYArray);
        toPrint(this.myZArray);
    }

    public static <E> void toPrint(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }
}
