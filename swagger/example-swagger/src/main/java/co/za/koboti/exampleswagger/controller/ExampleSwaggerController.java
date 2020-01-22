package co.za.koboti.exampleswagger.controller;

import co.za.koboti.exampleswagger.model.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ExampleSwaggerController {

    private List<Car> addCarsToList() {
        List<Car> cars = new ArrayList<Car>();
        {
            cars.add(new Car("Make0", "Model0", "regNo0", 1997));
            cars.add(new Car("Make1", "Model1", "regNo1", 1998));
            cars.add(new Car("Make2", "Model2", "regNo2", 1999));
        }
        return cars;
    }

    @RequestMapping(value = "/retrieveCars")
    public List<Car> retrieveCars() {
        return addCarsToList();
    }

    @RequestMapping(value = "/getCar/{make}")
    public Car getCar(@PathVariable(value = "make") String make) {
        return addCarsToList().stream().filter(x -> x.getMake().equalsIgnoreCase(make)).collect(Collectors.toList()).get(0);
    }
}
