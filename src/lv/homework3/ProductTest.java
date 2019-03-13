package lv.homework3;

public class ProductTest {
    public static void main(String[] args) {
        Product flowers = new Product();
        flowers.setName("Rozes");
        flowers.setRegularPrice(1.5);
        flowers.setDiscount(50);
        flowers.printInformation();
    }
}
