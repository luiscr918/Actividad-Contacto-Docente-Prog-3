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

@NotBlank
@Size(min = 3,max = 15)
    private String nombre;
@Size(min = 10)
@NotBlank
@Pattern(regexp = "^\\d+$", message = "solo se admiten numeros")
    private String cedula;
@NotBlank
@Pattern(regexp = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$",message =
    "Por favor, ingresa un correo electrónico válido. Debe tener el formato: nombre@dominio.com")
    private String correo;

@DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fechaNacimiento;
@NotBlank
    private String genero;

@Pattern(regexp = "^\\d+$", message = "solo se admiten numeros")
    @Size(min = 10)
    private String telefono;
    @Size(min = 10,max = 45)
    private String direccion;

    private Boolean antMedicos;

    @Pattern(regexp = "^\\d+$", message = "solo se admiten numeros")
    @Size(min = 10)
    private String contEmergencia;
@NotBlank
    private String grupoSanguineo;
}
