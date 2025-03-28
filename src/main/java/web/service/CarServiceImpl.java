package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.dao.CarDao;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return carDao.getSomeCars(count);
    }
}
