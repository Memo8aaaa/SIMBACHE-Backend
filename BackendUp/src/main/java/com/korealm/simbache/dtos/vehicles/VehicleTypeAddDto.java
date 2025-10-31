package com.korealm.simbache.dtos.vehicles;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleTypeAddDto {

    // REQUISITO 1: No debe estar vacío (NotBlank)
    // REQUISITO 3: Máximo 255 caracteres (Size)
    @NotBlank(message = "El nombre del tipo de vehículo no puede estar vacío.")
    @Size(max = 20, message = "El nombre no debe exceder los 20 caracteres.")
    private String newType;
}