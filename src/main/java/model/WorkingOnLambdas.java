package model;

public class WorkingOnLambdas {



    public static void main(String[] args) {

        WorkingOnLambdas tester = new WorkingOnLambdas();

       MathOperation multiply = (int a, int b) -> a * b;

       MathOperation addFunction = (int a, int b) -> a + b;

       MathOperation safeDivideFunction = (int z, int x) -> {
            if (x == 0) return 0;
            return z/x;
        };

        StringOperation stringLengthCount = (String s) -> s.length();

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface StringOperation {
        int stringLength(String s); 
    }





}
