public abstract class Processor {

    public String name;

    public abstract FInteger process(FInteger a, FInteger b);

    public String getName() {
        return name;
    }

}
