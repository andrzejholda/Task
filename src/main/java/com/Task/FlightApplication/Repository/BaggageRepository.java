package com.Task.FlightApplication.Repository;

import com.Task.FlightApplication.Model.Baggage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BaggageRepository extends JpaRepository<Baggage,Long> {
    @Query(value = "SELECT SUM(pieces) FROM baggage,flight WHERE flight.id=baggage.idFlight AND arrival_AirportIATACode LIKE %:arrival_AirportIATACode AND departure_Date LIKE %:departure_Date", nativeQuery = true)
    Integer totalNumberPiecesBaggageArriv(@Param("arrival_AirportIATACode") String arrival_AirportIATACode, @Param("departure_Date") String departure_Date);
    @Query(value = "SELECT SUM(pieces) FROM baggage,flight WHERE flight.id=baggage.idFlight AND departure_AirportIATACode LIKE %:departure_AirportIATACode AND departure_Date LIKE %:departure_Date", nativeQuery = true)
    Integer totalNumberPiecesBaggageDepart(@Param("departure_AirportIATACode") String arrival_AirportIATACode, @Param("departure_Date") String departure_Date);
    @Query(value = "SELECT SUM(weight) FROM baggage,flight WHERE flight.id=baggage.idFlight AND number LIKE %:number AND departure_Date LIKE %:departure_Date", nativeQuery = true)
    Integer baggageWeight(@Param("number") int number, @Param("departure_Date") String departure_Date);
}