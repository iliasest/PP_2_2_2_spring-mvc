package web.model;

public class Car {

    private int id;
    private String model;

    private String color;

    public Car(int id, String model, String color) {
        this.model = model;
        this.id = id;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setSeries(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
