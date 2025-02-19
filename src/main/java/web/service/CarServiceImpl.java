package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    public static List<Car> cars = Arrays.asList(new Car[]{
            new Car("Kia Rio", "Red", 2020),
            new Car("BMW M3", "Black", 2024),
            new Car("Toyota Corolla", "White", 2021),
            new Car("Audi Q7", "Gray", 2022),
            new Car("Lada Vesta", "Silver", 2023)});

    @Override
    public List<Car> getCars(int count) {
        count = (count >= 5 || count < 0) ? 5 : count;
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
