package com.Task.FlightApplication.Repository;

import com.Task.FlightApplication.Model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {

   @Query(value = "SELECT number FROM flight WHERE departure_AirportIATACode LIKE %:departure_AirportIATACode% AND departure_Date LIKE %:departure_Date", nativeQuery = true)
   Integer finddepartureAirportFlightNumber(@Param("departure_AirportIATACode") String departure_AirportIATACode,@Param("departure_Date") String departure_Date);
   @Query(value = "SELECT number FROM flight WHERE arrival_AirportIATACode LIKE %:arrival_AirportIATACode% AND departure_Date LIKE %:departure_Date", nativeQuery = true)
   Integer findArriveAirportFlightNumber(@Param("arrival_AirportIATACode") String arrival_AirportIATACode,@Param("departure_Date")String departure_Date);
}




