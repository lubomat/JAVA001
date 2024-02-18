package com.example.basics.control_flow_statements;

public class InfiniteLoop {
    public static void main(String[] args) {

        while(true) {
            int random = (int)Math.round(10 * Math.random());
            System.out.println(random);

            if(random == 10){
                System.out.println("wyjscie z petli while");
                break;
            }

            // TODO: 12.01.2023 ok 



        }
        for( ; ; ) {
            int random = (int)Math.round(10 * Math.random());

            System.out.println(random);

            if(random == 3 || random == 8){
                System.out.println("Wyjscie z petli for");
                break;
            }
        }

        // TODO: 12.01.2023  
    }
}
