package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class CarDAOImpl implements CarDAO {

    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Honda", "Accord", 100));
        cars.add(new Car("Honda", "Civic", 200));
        cars.add(new Car("Toyota", "Corrola", 300));
        cars.add(new Car("Toyota", "Camry", 400));
        cars.add(new Car("KIA", "Rio II", 500));
    }

    public CarDAOImpl() {
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
