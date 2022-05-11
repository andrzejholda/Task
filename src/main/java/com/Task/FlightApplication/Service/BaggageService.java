package com.Task.FlightApplication.Service;

import com.Task.FlightApplication.Repository.BaggageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaggageService {


    @Autowired
    BaggageRepository baggageRepository;

public Integer totalNumberPiecesBaggageArriv(String arrival_AirportIATACode,String departure_Date)throws NumberFormatException{
        if (departure_Date.length() != 25 || arrival_AirportIATACode.length() != 3)          //cheeck depart_Date lenght or arrival_Airport from DB and  meybe throw except
            throw new NumberFormatException();
        else
            return baggageRepository.totalNumberPiecesBaggageArriv(arrival_AirportIATACode,departure_Date);
}
public Integer totalNumberPiecesBaggageDepart(String departure_AirportIATACode,String departure_Date)throws Exception{
     if (departure_Date.length()!=25||departure_AirportIATACode.length() != 3)           //same like up
        throw new Exception();
     else
         return baggageRepository.totalNumberPiecesBaggageDepart(departure_AirportIATACode,departure_Date);
}
public Integer baggageWeight(int number,String departure_Date)throws Exception{
    if (departure_Date.length()!=25)      //same like up
        throw new Exception();
    else
        return baggageRepository.baggageWeight(number,departure_Date);
}
}
