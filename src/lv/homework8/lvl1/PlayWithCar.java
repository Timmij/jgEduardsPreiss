package lv.homework8.lvl1;

public class PlayWithCar {

    public static void main(String[] args) {
        testCarsToString();
        testPassengerCarEquals();
        testBussEquals();
        tesTruckEquals();
    }

    private static void tesTruckEquals() {
        Truck truck = new Truck("Scania", "black", 42);
        Truck truck1 = new Truck("Scania", "black", 100);
        System.out.println("Does the trucks have the same cargo Capasity ");
        boolean actual = truck.equals(truck1);
        System.out.println(actual);
    }

    private static void testBussEquals() {
        Buss buss = new Buss("Setra", "blue", 45);
        Buss buss1 = new Buss("Setra", "red", 45);
        System.out.println("Does Setra busses have the same seat count ");
        boolean actual = buss.equals(buss1);
        System.out.println(actual);
    }

    private static void testPassengerCarEquals() {
        PassengerCar mazda = new PassengerCar("Mazda", "red", 2, 3);
        PassengerCar porshe = new PassengerCar("Porshe", "black", 5, 2);
        System.out.println("Is the cars the same ");
        boolean actual = mazda.equals(porshe);
        System.out.println(actual);
    }

    private static void testCarsToString() {
        PassengerCar mazda = new PassengerCar("Mazda", "red", 2, 3);
        PassengerCar porshe = new PassengerCar("Porshe", "black", 5, 2);
        Buss buss = new Buss("Setra", "blue", 42);
        Buss buss1 = new Buss("Setra", "red", 42);
        Truck truck = new Truck("Scania", "black", 42);
        Truck truck1 = new Truck("Scania", "black", 100);

        Car[] mycar = {mazda, porshe, buss, buss1, truck, truck1};
        for (Car car : mycar) {
            System.out.println(car);
        }
    }
}
