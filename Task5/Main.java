package Task5;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(140,"Ford","purple",5,"sb-5555");
        Truck myTruck = new Truck(120,"Mersedes","black",5,"kk-8800",5000);

        myCar.accelerate(20);
        myCar.turnOnEngine();
        myCar.accelerate(10);
        myCar.printCurentSpeed();
        myCar.changeGear(2);
        myCar.accelerate(30);
        myCar.printCurentSpeed();
        myCar.changeGear(4);
        myCar.accelerate(70);
        myCar.printCurentSpeed();
        myCar.changeGear(2);
        myCar.decelerate(40);
        myCar.printCurentSpeed();
        myCar.turnLeft();
        myCar.turnRight(60);
        myCar.brake();
        myCar.turnOffEngine();

        myTruck.loadTruck(6000);
        myTruck.loadTruck(3000);
        myTruck.unloadTruck();
    }
}
