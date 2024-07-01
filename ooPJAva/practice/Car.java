public class Car {
    private String color;
    private String model;
    private int year;

    // getters
    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void accelerate() {
        System.out.print("Car is accelerating... ");
    }

    public static void main(String...a) {
        Car myCar = new Car();
        myCar.setColor("Red");
        myCar.setModel("Toyota");
        myCar.setYear(2024);
        
    }
}
