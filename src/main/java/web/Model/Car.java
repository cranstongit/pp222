package web.Model;

import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private int series;

    public Car(String make, String model, int series) {
        this.make = make;
        this.model = model;
        this.series = series;
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

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(make, model, series);
    }
}
