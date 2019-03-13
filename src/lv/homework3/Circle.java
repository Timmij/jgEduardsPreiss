package lv.homework3;

public class Circle {

   private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    double calculateArea(){
        return 3.14* radius *radius;  // ctrl + alt + l

    }

}
