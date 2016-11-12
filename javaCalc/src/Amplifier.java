public class Amplifier extends Processor {

    public Amplifier() {
        this.name = "Amplifier";
    }

    @Override
    public FInteger process(FInteger c, FInteger d) {
        return c.amplify(d);
    }

}
