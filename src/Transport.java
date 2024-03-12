public abstract class Transport implements Printable {
    private String type;
    private String name;
    private int speedLimit;
    private int yearProduced;

    public Transport(String type, String name, int speedLimit, int yearProduced) {
        this.type = type;
        this.name = name;
        this.speedLimit = speedLimit;
        this.yearProduced = yearProduced;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    @Override
    public void print() {
        System.out.println("Transport type: " + this.type +
                "\nTransport name: " + this.name +
                "\nTransport speed: " + this.speedLimit + " km/h" +
                "\nTransport produced year: " + this.yearProduced);
    }
}
