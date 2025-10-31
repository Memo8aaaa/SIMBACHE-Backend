package com.korealm.simbache.dtos.vehicles;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class VehicleTypeUpdateDto {
    @NotBlank(message = "El nombre actual es obligatorio.")
    @Size(max = 20, message = "El nombre actual no debe exceder los 20 caracteres.")
    private String currentName;

    @NotBlank(message = "El nombre actual es obligatorio.")
    @Size(max = 20, message = "El nombre actual no debe exceder los 20 caracteres.")
    private String newName;
}

