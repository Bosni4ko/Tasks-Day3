package Task5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Vehicle testVehicle;
    @Before
    public void setUp(){
        testVehicle = new Vehicle(140,"Ford","purple");
    }

    @Test
    public void turnOnEngine() {
        testVehicle.turnOnEngine();
        assertEquals(true,testVehicle.isEngineOn);
    }

    @Test
    public void turnOffEngine() {
        testVehicle.turnOffEngine();
        assertEquals(false,testVehicle.isEngineOn);
    }

    @Test
    public void turnRight1() {
        testVehicle.turnRight();
        assertEquals(0,testVehicle.direction);
        testVehicle.speed = 10;
        testVehicle.turnRight();
        assertEquals(315,testVehicle.direction);

    }

    @Test
    public void TurnRight2() {
        testVehicle.turnRight(60);
        assertEquals(0,testVehicle.direction);
        testVehicle.speed = 10;
        testVehicle.turnRight(360);
        assertEquals(0,testVehicle.direction);
    }

    @Test
    public void turnLeft1() {
        testVehicle.turnLeft();
        assertEquals(0,testVehicle.direction);
        testVehicle.speed = 10;
        testVehicle.turnLeft();
        assertEquals(45,testVehicle.direction);
    }

    @Test
    public void testTurnLeft2() {
        testVehicle.turnLeft(60);
        assertEquals(0,testVehicle.direction);
        testVehicle.speed = 10;
        testVehicle.turnLeft(360);
        assertEquals(0,testVehicle.direction);
    }
}