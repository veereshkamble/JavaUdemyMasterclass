package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car porsche = new Car();
        Car maruti = new Car();
        System.out.println("Model is :" + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is :" + porsche.getModel());
    }
}
