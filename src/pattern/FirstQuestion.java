package pattern;

public class FirstQuestion {
    public static void main(String[] args) {
        BinaryOp adder = new Adder();
        BinaryOp mult = new Multiflier();
        Binder calc = new Calculator();

        int addResult = calc.calc(0, 1, 1, 10, adder);
        int multResult = calc.calc(1, 1, 1, 10, mult);

        System.out.println(addResult);
        System.out.println(multResult);
    }
}

class Adder implements BinaryOp {
    @Override
    public int calc(int init, int start, int step, int end) {
        for (int i = start; i <= end; i += step) {
            init += i;
        }
        return init;
    }
}

class Multiflier implements BinaryOp {
    @Override
    public int calc(int init, int start, int step, int end) {
        for (int i = start; i <= end; i += step) {
            init *= i;
        }
        return init;
    }
}

interface BinaryOp {
    int calc(int init, int start, int step, int end);
}

abstract class Binder {
    abstract int calc(int init, int start, int step, int end, BinaryOp binder);
}

class Calculator extends Binder {
    @Override
    public int calc(int init, int start, int step, int end, BinaryOp binder) {
        return binder.calc(init, start, step, end);
    }
}

