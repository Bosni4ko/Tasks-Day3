package Task5;

public class Truck extends Car{
    protected int capacity;
    protected int loaded;

    public Truck(int maxSpeed,String manufactorer,String color,int gearCount,String registrationNumber,int capacity){
        super(maxSpeed, manufactorer,color, gearCount, registrationNumber);
        this.capacity = capacity;
        loaded = 0;
    }

    public void loadTruck(int size){
        if(loaded + size > capacity) {
            System.out.println("Truck will be overloaded");
        }
        else loaded += size;
    }

    public void unloadTruck() {
        loaded = 0;
    }
}
