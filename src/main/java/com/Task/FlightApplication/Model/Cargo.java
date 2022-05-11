package com.Task.FlightApplication.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cargo")
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCargo")
    private int idCargo;
    @Column(name = "idFlight1")
    private int idFlight1;
    @Column(name = "weight")
    @NonNull
    private int weight;
    @Column(name = "WeightUnit")
    @NonNull
    private String weightUnit;
    @Column(name = "pieces")
    @NonNull
    private int pieces;

    @NonNull
    @ManyToOne
    private Flight flight;
}
