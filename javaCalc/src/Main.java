public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
        Main main = new Main();
        main.simpleCalc();
    }

    public static  void simpleCalc() {
        calc = new Calculator(
                new Summator(),
                new Amplifier(),
                new Contractor(),
                new Divider()
        );

        System.out.println(calc.sum(
                new FInteger(4),
                new FInteger(12)
        ).getValue());

        System.out.println(calc.amp(
                new FInteger(3),
                new FInteger(4)
        ).getValue());


        System.out.println(calc.con(
                new FInteger(10),
                new FInteger(5)
        ).getValue());

        System.out.println(calc.div(
                new FInteger(60),
                new FInteger(10)
        ).getValue());
    }
}
