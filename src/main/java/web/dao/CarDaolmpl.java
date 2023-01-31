package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaolmpl implements CarDao{
    private List<Car> cars = Arrays.asList(
            new Car("name1", 1, "color1"),
            new Car("name2", 2, "color2"),
            new Car("name3", 3, "color3"),
            new Car("name4", 4, "color4"),
            new Car("name5", 5, "color5")
    );
    @Override
    public List<Car> getCarsByLimitedIndex(Integer index) {
        if (index == null || index > cars.size()) {
            index = cars.size();
        }
        return cars.subList(0, index);
    }
}
