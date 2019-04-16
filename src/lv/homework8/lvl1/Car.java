package lv.homework8.lvl1;

//šai ir jābūt vienkārši klasei
public abstract class Car {

    protected String brand;
    protected String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car brand " + brand
                + " it is  " + color;
    }
}
