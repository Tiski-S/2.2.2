package web.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    CarDao carDao;


    public CarServiceImpl(@Qualifier("carDaoImpl") CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> getCar(List<Car> carList, int count) {
        return carDao.getCar(carList, count);
    }
}
