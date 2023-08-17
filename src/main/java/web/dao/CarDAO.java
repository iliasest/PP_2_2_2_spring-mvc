package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private final List<Car> cars;

    public CarDAO() {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Ford", "Blue"));
        cars.add(new Car(2, "Chevrolet", "Yellow"));
        cars.add(new Car(3, "Volga", "Red"));
        cars.add(new Car(4, "Dodge", "Black"));
        cars.add(new Car(5, "Ferrari", "White"));
    }

    public List<Car> show(long count) {
        return cars.stream().limit(count).toList();
    }
}
