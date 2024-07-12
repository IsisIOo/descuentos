package com.example.descuentos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "descuento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Descuento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)

    private Long id;
    //amount es el total del descuento y number es la cantidad de veces que se puede aplicar ese descuento (2 = a 2 autos se les peude aplicar)
    private double toyotaAmount;
    private double toyotanumber;

    private double fordAmount;
    private double fordnumber;

    private double hondaAmount;
    private double hondanumber;

    private double hyundaiAmount;
    private double hyundainumber;
}
