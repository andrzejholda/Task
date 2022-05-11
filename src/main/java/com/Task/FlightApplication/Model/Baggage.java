package com.Task.FlightApplication.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "baggage")
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Baggage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBaggage")
    private int idBaggage;
    @Column(name = "idFlight")
    private int idFLight;
    @Column(name = "weight")
    private int weight;
    @Column(name = "weightUnit")
    private String weightUnit;
    @Column(name = "pieces")
    private int pieces;

    @NonNull
    @ManyToOne
    private Flight flight;
}
