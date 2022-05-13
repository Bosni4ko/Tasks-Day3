package Task5;

public class Vehicle {
    protected int speed;
    protected int maxSpeed;
    protected int direction;//(0-360 in degrees, 0 - ->; 180 - <-)
    protected boolean isEngineOn;
    protected String manufactorer;
    protected String color;

    public Vehicle(int maxSpeed,String manufactorer,String color){
        this.maxSpeed = maxSpeed;
        this.manufactorer = manufactorer;
        this.color = color;
        speed = 0;
        direction = 0;
        isEngineOn = false;
    }

    public void turnOnEngine(){
        if(!isEngineOn){
            this.isEngineOn = true;
            System.out.println("Engine started.");
        }
        else System.out.println("Engine is already started.");
    }
    public void turnOffEngine(){
        if(isEngineOn){
            this.isEngineOn = false;
            System.out.println("Engine turned off.");
        }
        else System.out.println("Engine is not started.");
    }

    public void turnRight(){
        if(speed > 0){
            if(direction - 45 >0){
                direction -= 45;
            }
            else {
                direction -= 45;
                direction += 360;
            }
        }
        else System.out.println("Can't turn while not driving");
    }
    public void turnRight(int turn){
        if(speed > 0){
            if(direction - turn >0){
                direction -= turn;
            }
            else {
                direction -= turn;
                direction += 360;
            }
        }
        else System.out.println("Can't turn while not driving");
    }

    public void turnLeft(){
        if(speed > 0){
            if(direction + 45 < 360){
                direction += 45;
            }
            else {
                direction += 45;
                direction -= 360;
            }
        }
        else System.out.println("Can't turn while not driving");
    }

    public void turnLeft(int turn){
        if(speed > 0){
            if(direction + turn < 360){
                direction += turn;
            }
            else {
                direction += turn;
                direction -= 360;
            }
        }
        else System.out.println("Can't turn while not driving");
    }

    public void printCurentSpeed(){
        System.out.println("Cuurent speed is " + speed +" km/h.");
    }
}
