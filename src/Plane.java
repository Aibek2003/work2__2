public class Plane extends Transport implements Printable{
    private int numberOfEngines;

    public Plane(String type, String name, int speedLimit, int yearProduced, int numberOfEngines) {
        super(type, name, speedLimit, yearProduced);
        this.numberOfEngines = numberOfEngines;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Number of engines: " + this.numberOfEngines);
        System.out.println("");
    }
}
