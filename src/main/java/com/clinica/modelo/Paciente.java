package com.clinica.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Paciente {
    //Validación de nombre
    @NotBlank
    @Size(min = 3, max = 15)
    private String nombre;
    //Validación de cedula
    @Size(min = 10)
    @NotBlank
    @Pattern(regexp = "^\\d+$", message = "solo se admiten numeros")
    private String cedula;
    //Validación de correo
    @NotBlank
    @Pattern(regexp = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$", message =
            "Por favor, ingresa un correo electrónico válido. Debe tener el formato: nombre@dominio.com")
    private String correo;
    //Validación de fecha de nacimiento
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fechaNacimiento;
    //Validación de genero
    @NotBlank
    private String genero;
    //Validación de telefono
    @Pattern(regexp = "^\\d+$", message = "solo se admiten numeros")
    @Size(min = 10)
    private String telefono;
    //Validación de direccion
    @Size(min = 10, max = 45)
    private String direccion;
    //no tiene validación
    private Boolean antMedicos;
    //Validación de contacto de emergencia
    @Pattern(regexp = "^\\d+$", message = "solo se admiten numeros")
    @Size(min = 10)
    private String contEmergencia;
    //Validación de grupo sanguineo
    @NotBlank
    private String grupoSanguineo;
}
