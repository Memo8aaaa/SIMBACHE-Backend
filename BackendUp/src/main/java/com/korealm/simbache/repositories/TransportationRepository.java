package com.korealm.simbache.repositories;

import com.korealm.simbache.models.Transportation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface TransportationRepository extends JpaRepository<Transportation, Long> {
    // Método que comprueba si existe algún 'Transportation' con un 'VehicleType' específico.
    boolean existsByVehicleType_TypeId(short typeId);
}