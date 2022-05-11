package com.Task.FlightApplication.Controller;

import com.Task.FlightApplication.Service.BaggageService;
import com.Task.FlightApplication.Service.CargoService;
import com.Task.FlightApplication.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;

@RestController
public class FlightController {


    @Autowired
    FlightService flightService;
    @Autowired
    BaggageService baggageService;
    @Autowired
    CargoService cargoService;

    @GetMapping("/flightDepart/{departure_AirportIATACode}/{departure_Date}")
    public ResponseEntity<Integer> findDepartNumber(@PathVariable("departure_AirportIATACode") String departure_AirportIATACode, @PathVariable("departure_Date") String departure_Date)throws NumberFormatException {
        try {
            return ResponseEntity.ok(flightService.findDepartNumber(departure_AirportIATACode, departure_Date));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("/flightArriv/{arrival_AirportIATACode}/{departure_Date}")
    public ResponseEntity <Integer> findArrivNumber(@PathVariable("arrival_AirportIATACode") String arrival_AirportIATACode,@PathVariable("departure_Date") String departure_Date)throws NumberFormatException {
       try {
           return ResponseEntity.ok(flightService.findArrivNumber(arrival_AirportIATACode, departure_Date));
       }catch (Exception e){
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
       }
    }
    @GetMapping("/flightBaggageArriv/{arrival_AirportIATACode}/{departure_Date}")
    public ResponseEntity <Integer> totalNumberPiecesBaggageArriv(@PathVariable("arrival_AirportIATACode")String arrival_AirportIATACode,@PathVariable("departure_Date") String departure_Date) throws Exception{
           try {
               return ResponseEntity.ok(baggageService.totalNumberPiecesBaggageArriv(arrival_AirportIATACode, departure_Date));
           }catch (Exception e){
               return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
           }
    }
    @GetMapping("/flightBaggageDepart/{departure_AirportIATACode}/{departure_Date}")
    public ResponseEntity <Integer> totalNumberPiecesBaggageDepart(@PathVariable("departure_AirportIATACode")String departure_AirportIATACode,@PathVariable("departure_Date") String departure_Date)throws  Exception {
        try {
            return ResponseEntity.ok(baggageService.totalNumberPiecesBaggageDepart(departure_AirportIATACode, departure_Date));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @GetMapping("/flightBaggageWeight/{number}/{departure_Date}")
    public ResponseEntity <Integer> baggageWeight(@PathVariable("number")int number,@PathVariable("departure_Date") String departure_Date) throws Exception {
         try {
             return ResponseEntity.ok(baggageService.baggageWeight(number, departure_Date));
         }catch (Exception e){
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
         }
    }
    @GetMapping("/flightCargoWeight/{number}/{departure_Date}")
    public ResponseEntity <Integer> cargoWeight(@PathVariable("number")int number, @PathVariable("departure_Date") String departure_Date) throws Exception {
        try {
            return ResponseEntity.ok(cargoService.cargoWeight(number, departure_Date));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }
    }
    @GetMapping("/flightTotalWeight/{number}/{departure_Date}")
    public ResponseEntity <Integer> totalWeight(@PathVariable("number")int number, @PathVariable("departure_Date") String departure_Date, HttpServletResponse response)throws Exception {
       try{
        return ResponseEntity.ok(cargoService.totalWeight(number, departure_Date));
    }catch (Exception e){
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
       }
    }
}
