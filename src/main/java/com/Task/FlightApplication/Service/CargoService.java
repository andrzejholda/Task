package com.Task.FlightApplication.Service;
import com.Task.FlightApplication.Repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CargoService {

    @Autowired
    CargoRepository cargoRepository;

public Integer cargoWeight(int number, String departure_Date) throws Exception  {

        if (departure_Date.length() != 25)// cheeck depart lenght date from DB and maybe throw except.
            throw new Exception();
        else
            return cargoRepository.cargoWeight(number, departure_Date);
}
public  Integer totalWeight(int number,String departure_Date)throws Exception{

        if (departure_Date.length()!=25)               //same like up
            throw new Exception();
        else
         return cargoRepository.totalWeight(number,departure_Date);
}

}


