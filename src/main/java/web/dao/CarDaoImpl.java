package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    public List<Car> carList = Arrays.asList(
            new Car("Mazda", 100, 3312441),
            new Car("BMW", 200, 13461),
            new Car("MRSDS", 300, 453457),
            new Car("AUDI", 400, 6564355),
            new Car("Honda", 500, 61343434)
    );



    @Override
    public List<Car> getCar(int count) {
        if(count >= 5){
            return carList;
        }
        return carList.subList(0, count);
    }
}
