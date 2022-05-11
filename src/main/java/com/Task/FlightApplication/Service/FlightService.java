package com.Task.FlightApplication.Service;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.Task.FlightApplication.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {

    }

    public Integer findDepartNumber(String departure_AirportIATACode, String departure_Date) throws Exception{
         if (departure_Date.length()!=25 || departure_AirportIATACode.length()!=3)  //cheeck depart_Date lenght or arrival_Airport from DB and  meybe throw except
                throw new Exception();
          else
        return  flightRepository.finddepartureAirportFlightNumber(departure_AirportIATACode,departure_Date);

    }
    public Integer findArrivNumber(String arrival_AirportIATACode, String departure_Date)throws Exception {
        if (departure_Date.length()!=25 || arrival_AirportIATACode.length()!=3)  //same like up
            throw new Exception();
        else
        return  flightRepository.findArriveAirportFlightNumber(arrival_AirportIATACode,departure_Date);
    }
}

