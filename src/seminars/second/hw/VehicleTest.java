package seminars.second.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    public void Setup(){
        car=new Car("BMV", "676", 2015);
        motorcycle=new Motorcycle("Wings","23453T",1999);
    }
// - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)

    @Test
    public void testCarIsInstanceOfVehicle(){

        assertTrue(car instanceof  Vehicle);
    }
// - проверка того, объект Car создается с 4-мя колесами

    @Test
    public  void  testCar4Wheels(){
        assertEquals(car.getNumWheels(),4);
    }
// - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive()
    @Test
    public  void  testCarSpeedDrive(){
        car.testDrive();
        assertEquals(car.getSpeed(),60);
    }
// - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public  void  testCarPark() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

// - проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public  void  testMotocycle2Wheels(){
        assertEquals(motorcycle.getNumWheels() ,2);
}
//            - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public  void  testMotocycleSpeedDrive(){
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(),75);
}

//            - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public  void  testMotocyclePark(){
        motorcycle.testDrive();
        motorcycle.park();;
        assertEquals(motorcycle.getSpeed(),0);
    }


}