package lv.homework8.lvl1;

import java.util.Objects;

public class Buss extends Car {

    protected int passengerSeatCount;

    public Buss(String brand, String color, int passengerSeatCount) {
        super(brand, color);
        this.passengerSeatCount = passengerSeatCount;
    }

    @Override
    public String toString() {
        return "Buss: " + brand +
                " it is " + color +
                " it has " + passengerSeatCount + " seats ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Buss)) return false;
        Buss buss = (Buss) o;
        //color un brand arī jāsalīdzina
        //labāk realizēt equals metodi super klasē un tad to izmantot
        return brand == buss.brand &&
                passengerSeatCount == buss.passengerSeatCount;
    }

    //color un brand arī jāiekļauj
    @Override
    public int hashCode() {
        return Objects.hash(brand, passengerSeatCount);
    }
}
