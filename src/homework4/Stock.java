package homework4;

public class Stock {

    private String company;
    private double value;
    private double max;
    private double min;

    Stock(String company, double currentValue) {
        this.company = company;
        this.value = currentValue;
        this.max = currentValue;
        this.min = currentValue;

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCurrentValue() {
        return value;
    }

    public void setCurrentValue(double currentValue) {
        this.value = currentValue;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void updatePrice(double currentValue) {
        if (currentValue > max) {
            max = currentValue;
        }
        if (currentValue < min) {
            min = currentValue;
        }
        this.value = currentValue;

    }

    public void printInformation() {
        System.out.println(company + "  Current value = " + value
                + " Max = " + max
                + " Min = " + min);
    }


}
