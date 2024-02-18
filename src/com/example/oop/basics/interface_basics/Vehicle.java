package com.example.oop.basics.interface_basics;

public interface Vehicle {
    public void move();
    public void stop();
    public abstract void turn();  // nie trzeba podawac implementacji tej metody bo abstract jest domyslnie
    public float getTopSpeed();



}
