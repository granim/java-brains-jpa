package lambdas;

public class WorkingOnLambdas {

    public static void main(String args[]) {

       //lambda expressions
        MathOperation multiplyTwo = (int a, int b) -> a * b;
        MathOperation addFunction = (int a, int b) -> a + b;
        MathOperation safeDivideFunction = (int z, int x) -> {
            if (x == 0) return 0;
            return z / x;
        };

        MathOperation zerOut = (int a, int b) -> a - b;

        StringOperation stringLengthCount = s -> s.length();
        int letter = stringLengthCount.stringChecker("Hello");


        StringsToChar stringTest = s -> s.charAt(0);
        char firstChar = stringTest.stringChecker("Hello");

        System.out.println(firstChar);


        int intial = 0;
        intial = addFunction.operation(intial, 40);
        intial = addFunction.operation(intial, 20);

        intial = zerOut.operation(intial, intial);
        System.out.println("THe initial int final number is: " + intial);

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface StringOperation {
        int stringChecker(String s);
    }

    interface StringsToChar {
        char stringChecker(String s);
    }





}
