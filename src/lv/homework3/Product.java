package lv.homework3;

//ctrl + alt + l
public class Product {

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double regularPrice;
    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    private double discount;
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double calculateActualPrice(){
        return  regularPrice - (regularPrice / 100 * discount);
    }

public void printInformation(){
    System.out.println("Product : " + getName() + " regula Price = " + getRegularPrice() +"EUR, " +
            "discount = " + getDiscount() + "%, " + " catual price =" + calculateActualPrice() + "EUR");
}





}

