package com.example.lambda;

//interfejs funkcjny
interface Addition {
    int add(int a, int b);
}

//interfejs funkcyjny
interface MathOperation<T> {
    T operate(T a, T b);
}

public class LambdaBasics {

    public void test(Addition addition) {
        System.out.println(addition.add(100,50));
    }

    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a + b;

        System.out.println(addition.add(11, 6)); // 17

        System.out.println(addition.add(20,5)); // 25

        LambdaBasics lambdaBasics = new LambdaBasics();
        lambdaBasics.test((a,b) -> a*2 + b );  // 250

        MathOperation<Float> addition2 = (a,b) -> a + b;
        System.out.println( addition2.operate(10.0f,6.0f) );

        MathOperation<Integer> substruction = (a,b) -> a - b;       // szablon na odejmowanie
        System.out.println(substruction.operate(10,20));  // -10
    }
}
