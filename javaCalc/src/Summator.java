public class Summator extends Processor {

    public Summator() {
        this.name = "Summator";
    }

    @Override
    public FInteger process(FInteger c, FInteger d) {
        return c.sum(d);
    }

}
