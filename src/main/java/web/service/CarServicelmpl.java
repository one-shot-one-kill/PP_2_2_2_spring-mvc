package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServicelmpl implements CarService{
    @Autowired
    private CarDao dao;

    @Override
    public List<Car> getCarsByLimitedIndex(Integer index) {
        return dao.getCarsByLimitedIndex(index);
    }
}
