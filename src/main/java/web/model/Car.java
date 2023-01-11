package web.model;

public class Car {

    String model;
    String series;
    String colour;

    public Car(String model, String series, String colour) {
        this.model = model;
        this.series = series;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car -> " +
                "model = " + model +
                ", series = " + series +
                ", colour = " + colour ;
    }
}
