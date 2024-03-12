import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];
        objects[0] = createObjects("Horse");
        objects[1] = createObjects("SHIP ");
        objects[2] = createObjects("  PlaNE");

        for (Printable object : objects){
            object.print();
        }
    }
    public static Printable createObjects(String className){
        Scanner scanner = new Scanner(System.in);
        className = className.trim();
        className = className.toLowerCase();
        switch (className){
            case "horse":
                System.out.println("Transport type: Ground");
                String transportType = "Ground";
                System.out.println("Transport name: Horse");
                String transportName = "Horse";
                System.out.println("Enter transport speed: ");
                int transportSpeed = scanner.nextInt();
                System.out.println("Enter produced year of transport: ");
                int transportYearProduced = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter transport nickname: ");
                String transportNickname = scanner.nextLine();
                return new Horse(transportType, transportName, transportSpeed, transportYearProduced, transportNickname);
            case "plane":
                System.out.println("Transport type: Air");
                String transportType2 = "Air";
                System.out.println("Transport name: Plane");
                String transportName2 = "Plane";
                System.out.println("Enter transport speed: ");
                int transportSpeed2 = scanner.nextInt();
                System.out.println("Enter produced year of transport: ");
                int transportYearProduced2 = scanner.nextInt();
                System.out.println("Enter transport number of engines: ");
                int transportNumberOfEngines = scanner.nextInt();
                return new Plane(transportType2, transportName2, transportSpeed2,
                        transportYearProduced2,transportNumberOfEngines );
            case "ship":
                System.out.println("Transport type: Sea");
                String transportType3 = "Sea";
                System.out.println("Transport name: Ship");
                String transportName3 = "Ship";
                System.out.println("Enter transport speed: ");
                int transportSpeed3 = scanner.nextInt();
                System.out.println("Enter produced year of transport: ");
                int transportYearProduced3 = scanner.nextInt();
                System.out.println("Enter transport deck area: ");
                int transportDeckArea = scanner.nextInt();
                return new Ship(transportType3, transportName3, transportSpeed3,
                        transportYearProduced3, transportDeckArea );
            default:
                System.out.println("There is no such transport");
                return null;
        }
    }
}