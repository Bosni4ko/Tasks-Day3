package Task5;

public class Car extends Vehicle{
    protected int gearCount;
    protected int gear;
    protected String registrationNumber;

    public Car(int maxSpeed,String manufactorer,String color,int gearCount,String registrationNumber){
        super(maxSpeed,manufactorer,color);
        this.gearCount = gearCount;
        this.registrationNumber = registrationNumber;
        gear = 0;
    }

    public void accelerate(int accSpeed){
        if(isEngineOn){
            if(accSpeed > 0){
                if(this.speed + accSpeed < this.maxSpeed/gearCount * gear){
                    this.speed += accSpeed;
                }
                else this.speed = this.maxSpeed/gearCount * gear;
            }
            else  System.out.println("Can't accelerate backwards");
        }
        else System.out.println("Engine is turned off");

    }
    public void decelerate(int decSpeed){
        if(isEngineOn) {
            if (this.speed - decSpeed > this.maxSpeed / gearCount * (gear - 1)) {
                this.speed -= decSpeed;
            } else this.speed = this.maxSpeed / gearCount * (gear - 1);
        }
        else System.out.println("Engine is turned off");
    }

    public void brake(){

        speed = 0;
        gear = 0;
    }

    public void changeGear(int gear){
        if(gear <= gearCount && gear >=-1) {
            this.gear = gear;
        }
    }
}
