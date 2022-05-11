package com.Task.FlightApplication.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "flight")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Flight {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "number")
    private int number;
    @Column(name = "departure_AirportIATACode")
    private String departure_AirportIATACode;
    @Column(name = "arrival_AirportIATACode")
    private String arrival_AirportIATACode;
    @Column(name = "departure_Date")
    private String departure_Date;
}
