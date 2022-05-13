package Task5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car testCar;
    @Before
    public void setUp(){
        testCar = new Car(140,"Ford","purple",5,"sb-8800");
    }
    @Test
    public void accelerateEngineOff() {
        testCar.accelerate(20);
        assertEquals(0,testCar.speed);
    }
    @Test
    public void accelerateEngineOn() {
        testCar.turnOnEngine();
        testCar.accelerate(40);
        assertEquals(0,testCar.speed);
        testCar.changeGear(1);
        testCar.accelerate(40);
        assertEquals(28,testCar.speed);
    }
    @Test
    public void accelerateGear1() {
        testCar.turnOnEngine();
        testCar.changeGear(1);
        testCar.accelerate(40);
        assertEquals(28,testCar.speed);
    }
    @Test
    public void accelerateBack() {
        testCar.turnOnEngine();
        testCar.changeGear(1);
        testCar.accelerate(-40);
        assertEquals(0,testCar.speed);
    }

    @Test
    public void decelerateEngineOff() {
        testCar.decelerate(25);
        assertEquals(0,testCar.speed);
    }
    @Test
    public void decelerateEngineOnStatic() {
        testCar.turnOnEngine();
        testCar.decelerate(30);
        assertEquals(-28,testCar.speed);
    }
    @Test
    public void decelerateEngineOnGear() {
        testCar.turnOnEngine();
        testCar.gear = 3;
        testCar.speed = 80;
        testCar.decelerate(30);
        assertEquals(56,testCar.speed);
    }

    @Test
    public void brake() {
        testCar.gear = 3;
        testCar.speed = 80;
        testCar.brake();
        assertEquals(0,testCar.speed);
        assertEquals(0,testCar.gear);
    }

    @Test
    public void changeGearNegative() {
        testCar.changeGear(-2);
        assertEquals(0,testCar.gear);
    }
    @Test
    public void changeGearOverMax() {
        testCar.changeGear(testCar.gearCount+1);
        assertEquals(0,testCar.gear);
    }
    @Test
    public void changeGear() {
        testCar.changeGear(testCar.gearCount);
        assertEquals(5,testCar.gear);
    }
}