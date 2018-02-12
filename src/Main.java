/**
 * Created by sergey.kliepikov on 2/11/18.
 */
public class Main {
    public static void main(String[] args) {
        Car c = new Car(true, false, 60);

        System.out.println(c.getSpeed());

        c.setSpeed(80);
        System.out.println("New speed is " + c.getSpeed());

        c.go();
        System.out.println("Does the car move? - " + c.getMovement());

        c.engineOff();
        System.out.println("Is the engine on - " + c.getEngineState());

        c.engineOn();
        System.out.println("Is the engine on - " + c.getEngineState());

        c.start(true);
        System.out.println("Is the engine on - " + c.getEngineState());

        c.start(false);
        System.out.println("Is the engine on - " + c.getEngineState());
    }
}
