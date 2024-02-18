package com.example.basics.control_flow_statements;

public class CodeBlock {
    public static void main(String[] args) {


            if ( 5 == 10 ) {
            int a = 5;
            System.out.println("a+: " +a);

            }
            int b = 12;
            if (7 > 2 ) {
                int a = 50;
                System.out.println(a + b);
            }


            int a = 98;  // za blokiem nie ma konfliktu nazw z a w bloku

        {
            int value = 9;
            {
                int test = 8;
                {
                    System.out.println("test: " + test);
                    System.out.println("value:" + value);
                    System.out.println("a: " +a +a); // 99

                }
            }
        }







    }
}
