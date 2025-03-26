package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Model.Car;
import web.DAO.CarDAO;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return carDAO.getSomeCars(count);
    }
}
