package com.example.basics.control_flow_statements;

public class SwitchInstruction {

    enum CarVariant {SEDAN, COMBI, SPORT}

    public static void main(String[] args) {

        int num = 1;

        switch (num) {
            case 1:
                System.out.println(1);
                System.out.println(" ok");
                break;
            case 3:
                System.out.println(3);
                break;
            case 10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
                break;
            default:
                System.out.println("Default: " + num);
        }


        String str = "Ania";

        switch (str) {
            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println("Ania");
                break;
            case "Maciek":
                System.out.println("Maciek");
                break;
            default:
                System.out.println("Default: " + str);
        }

        CarVariant car = CarVariant.SEDAN;

        switch (car) {
            case COMBI:
                System.out.println(CarVariant.COMBI);
                break;
            case SEDAN:
                System.out.println(CarVariant.SEDAN);
                break;
            case SPORT:
                System.out.println(CarVariant.SPORT);
                break;
            default:
                System.out.println("Default:" + car);
        }
    }
}
