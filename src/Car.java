/**
 * Created by sergey.kliepikov on 2/11/18.
 */
public class Car {
    private boolean engine;
    private boolean movement;
    private int speed;

    Car(boolean engine, boolean move, int speed){
        this.engine = engine;
        this.movement = move;
        this.speed = speed;
    }

    public boolean engineOn(){
        return engine = true;
    }

    public boolean engineOff(){
        return engine = false;
    }

    public void start(boolean engine){
        this.engine = engine;
    }

    public boolean go(){
        return movement = true;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean getEngineState(){
        return engine;
    }

    public boolean getMovement(){
        return movement;
    }

    public int getSpeed(){
        return speed;
    }
}
