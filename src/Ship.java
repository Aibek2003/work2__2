public class Ship extends Transport implements Printable{
    private int deckArea;

    public Ship(String type, String name, int speedLimit, int yearProduced, int deckArea) {
        super(type, name, speedLimit, yearProduced);
        this.deckArea = deckArea;
    }

    public int getDeckArea() {
        return deckArea;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Deck area: " + this.deckArea + "m.");
        System.out.println("");
    }
}
