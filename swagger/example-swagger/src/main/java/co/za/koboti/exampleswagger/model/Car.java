package co.za.koboti.exampleswagger.model;

public class Car {

    private String make;
    private String model;
    private String regNumber;
    private int yearMade;

    public Car() {
    }

    public Car(String make, String model, String regNumber, int yearMade) {
        this.make = make;
        this.model = model;
        this.regNumber = regNumber;
        this.yearMade = yearMade;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", yearMade=" + yearMade +
                '}';
    }


}
