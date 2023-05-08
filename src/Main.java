public class Main {

    public static void main(String[] args) {
        Cycles cycles = new Cycles();
        Calc calc = new Calc();

        cycles.forOddNums();
        System.out.println("--------------");
        cycles.forFactorial(2, 4);
        System.out.println("--------------");

        cycles.whileOddNums();
        System.out.println("--------------");
        cycles.whileFactorial(2, 4);
        System.out.println("--------------");

        cycles.doWhileOddNums();
        System.out.println("--------------");
        cycles.doWhileFactorial(2, 4);
        System.out.println("--------------");

        calc.calcToThePower(2, 5);
        System.out.println("--------------");

        cycles.sequenceOfNumbers();
        System.out.println("--------------");

        cycles.forMultiplication(4);
        System.out.println("--------------");

        cycles.forOddArray();
        System.out.println("\n--------------");

        cycles.forMinFromArray();
        System.out.println("\n--------------");

        cycles.forMaxFromArray();
        System.out.println("\n--------------");

        cycles.replaceMinMax();
        System.out.println("\n--------------");

    }
}