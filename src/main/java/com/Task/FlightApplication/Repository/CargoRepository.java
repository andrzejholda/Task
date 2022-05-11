package com.Task.FlightApplication.Repository;

import com.Task.FlightApplication.Model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;


public interface CargoRepository extends JpaRepository<Cargo,Long> {

    @Query(value = "SELECT SUM(weight) FROM cargo,flight WHERE flight.id=cargo.idFlight1 AND number LIKE %:number AND departure_Date LIKE %:departure_Date", nativeQuery = true)
    Integer cargoWeight(@Param("number") int number, @Param("departure_Date") String departure_Date);
    @Query(value = "SELECT SUM(cargo.weight) + SUM(baggage.weight) FROM cargo,flight,baggage WHERE flight.id=cargo.idFlight1 AND flight.id=baggage.idFlight AND number LIKE %:number AND departure_Date LIKE %:departure_Date", nativeQuery = true)
    Integer totalWeight(@Param("number") int number, @Param("departure_Date") String departure_Date);
}
