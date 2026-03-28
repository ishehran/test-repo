package src.Inheritence;

public class MainMech {
    public static void main(String[] args) {
        Plane aeroplane = new Aeroplane();
        aeroplane.fly(); // This will call the fly method from the Plane class
        aeroplane.takeOff(); // This will call the takeOff method from the Aeroplane class
        // aeroplane.land(); // This would cause a compile-time error since the Plane reference doesn't have a land method
    }
}