package com.korealm.simbache.models;

import jakarta.persistence.Entity; //
import jakarta.persistence.Table;  //
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;
import lombok.Data; // Asumiendo que usas Lombok para simplificar

@Entity
@Table(name = "Transportation")
@Data // Incluye Getters, Setters, toString, etc.
public class Transportation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TransportationId")
    private Long transportationId;

    @Column(name = "PlateNumber", length = 32)
    private String plateNumber;

    //  CLAVE PARA EL REQUISITO 4 (Verificación de Hijos)
    // Mapeo de la clave foránea VehicleType_FK
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VehicleType_FK")
    private VehicleType vehicleType;

}