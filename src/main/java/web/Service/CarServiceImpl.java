package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Model.Car;
import web.DAO.CarDao;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    public CarServiceImpl() {
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public List<Car> getSomeCars() {
        return null;
    }
}
