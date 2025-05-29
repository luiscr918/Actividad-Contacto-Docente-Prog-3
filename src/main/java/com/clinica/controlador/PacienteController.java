package com.clinica.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
    @GetMapping("/registro")
    public String cargarRegistro(){
        return "paciente/registerPaciente";
    }
}
