package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] a = {2,3,9};
        int[] b = {3,5,2};
        Сonveyor conveyor= new Сonveyor( a, b );
        //conveyor.test();
        conveyor.start();
    }
}
