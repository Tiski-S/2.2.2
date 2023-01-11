package web.model;

public class Car {
    String model;
    int speed;
    int series;

    public  Car(){

    }

    public Car(String model, int speed, int series) {
        this.model = model;
        this.speed = speed;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
