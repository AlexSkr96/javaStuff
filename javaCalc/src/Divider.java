
public class Divider extends Processor {

    public Divider() {this.name = "Divider"; }

    @Override
    public FInteger process (FInteger c, FInteger d) {return c.divide(d); }
}
