public class Car {
    String model;
    String brand;
    int year;
    String color;

    public Car(String model, String brand, int year, String color) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + "\nBrand: " + getBrand() + "\nYear: " + getYear() + "\nColor: " + getColor();
    }

    public static void main(String[] args) {
        Car myCar = new Car("Mustang", "Ford", 2022, "Red");
        System.out.println(myCar.toString());
    }
}
