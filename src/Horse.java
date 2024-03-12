public class Horse extends Transport implements Printable{
    private String nickName;

    public Horse(String type, String name, int speedLimit, int yearProduced, String nickName) {
        super(type, name, speedLimit, yearProduced);
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Transport nickname: " + this.nickName);
        System.out.println("");
    }
}
