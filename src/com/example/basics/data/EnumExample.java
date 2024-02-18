package com.example.basics.data;



public class EnumExample {

    enum SoundVolume { LOW, MEDIUM, HIGH, VERY_HIGH};
    enum CarVariant {SEDAN, COBMI, SUPER_CAR};


    public static void main(String args[]) {
        SoundVolume phoneSound = SoundVolume.LOW;
        System.out.println(phoneSound);


    }
}
