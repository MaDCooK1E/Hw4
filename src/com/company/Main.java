package com.company;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.startWorking();
        factory.work();
        factory.produceCar();
        CarSuv carSuv = new CarSuv();
        carSuv.carIsReady();
        carSuv.getStarted();
        carSuv.openDoors();
        carSuv.closeDoors();
        carSuv.setTransmission(true);
        carSuv.whatTransmission();
        carSuv.type();
        carSuv.drive();
        carSuv.stop();


    }
}
