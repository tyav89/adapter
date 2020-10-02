public class IntsCalculator implements Ints {
    private Calculator calculator;

    public IntsCalculator() {
        calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand((double) arg0)
                .addOperand((double) arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand((double) arg0)
                .addOperand((double) arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) calculator.newFormula()
                .addOperand((double) a)
                .addOperand((double) b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
