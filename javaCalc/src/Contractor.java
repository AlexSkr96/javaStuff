
public class Contractor extends Processor {

    public Contractor() {this.name = "Contractor";}

    @Override
    public FInteger process (FInteger c, FInteger d) {return c.contract(d);}
}
