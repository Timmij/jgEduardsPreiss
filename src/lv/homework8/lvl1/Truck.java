package lv.homework8.lvl1;

import java.util.Objects;

public class Truck extends Car {

    protected int trucksCargoCapasity; //Typo

    public Truck(String brand, String color, int trucksCargoCapasity) {
        super(brand, color);
        this.trucksCargoCapasity = trucksCargoCapasity;
    }

    @Override
    public String toString() {
        return "Truck: " + brand +
                " it is " + color +
                " it has " + trucksCargoCapasity + " ton cargo capability ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        Truck truck = (Truck) o;
        //color un brand arī jāsalīdzina
        //labāk realizēt equals metodi super klasē un tad to izmantot
        return trucksCargoCapasity == truck.trucksCargoCapasity;
    }

    @Override
    //color un brand arī jāiekļauj
    public int hashCode() {
        return Objects.hash(trucksCargoCapasity);
    }
}
