package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO {

    List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Honda", "Accord", 100),
            new Car("Honda", "Civic", 200),
            new Car("Toyota", "Corrola", 300),
            new Car("Toyota", "Camry", 400),
            new Car("KIA", "Rio II", 500)));

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
