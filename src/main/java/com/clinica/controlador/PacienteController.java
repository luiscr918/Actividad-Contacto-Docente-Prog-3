package com.clinica.controlador;

import com.clinica.modelo.Paciente;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
    @GetMapping("/registro")
    public String mostrarRegistro(Model model){
        Paciente paciente=new Paciente();
        model.addAttribute("paciente",paciente);
        return "paciente/registerPaciente";
    }
    @PostMapping("/guardar")
    public String enviarPaciente(@Valid @ModelAttribute Paciente paciente,
                                 BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("errores", bindingResult.getAllErrors());
            return "paciente/registerPaciente";
        }else{
            return "paciente/historialPaciente";
        }

    }
}
