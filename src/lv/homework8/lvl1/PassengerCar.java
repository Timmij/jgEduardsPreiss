package lv.homework8.lvl1;

import java.util.Objects;

public class PassengerCar extends Car {

    protected int passengerSeatCount;
    protected int doorCount;


    public PassengerCar(String brand, String color, int passengerSeatCount, int doorCount) {
        super(brand, color);
        this.passengerSeatCount = passengerSeatCount;
        this.doorCount = doorCount;
    }

    @Override
    public String toString() {
        return "Passenger Car: " + brand +
                " it is " + color +
                " it has " + passengerSeatCount + " seats " +
                " and " + doorCount + " doors";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        PassengerCar that = (PassengerCar) o;
        //labāk realizēt equals metodi super klasē un tad to izmantot
        return brand == that.brand &&
                color == that.color &&
                passengerSeatCount == that.passengerSeatCount &&
                doorCount == that.doorCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, passengerSeatCount, doorCount);
    }
}
