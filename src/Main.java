public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.newFormula()
                .addOperand(5)
                .addOperand(4)
                .calculate(Calculator.Operation.MULT)
                .result()
        );

        Ints calcul = new IntsCalculator();
        System.out.println(calcul.mult(5,4));
    }
}
