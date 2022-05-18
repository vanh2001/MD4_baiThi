package com.codegym.baithi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "national_id")
    private National national;

    private double area;
    private Long population;
    private double gdp;
    private String description;
}
