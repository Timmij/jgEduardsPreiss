package lv.homework3;

//Ok
public class CarTest {

    public static void main(String[] args) {

        Car janisCar = new Car();
        janisCar.setColor("red");
        janisCar.setManufacturer("Audi");
        janisCar.setYear(2011);
        System.out.println("Janis has " + janisCar.getColor() + " car" );
        System.out.println("It is a " + janisCar.getManufacturer() + " from year " + janisCar.getYear());
    }
}
