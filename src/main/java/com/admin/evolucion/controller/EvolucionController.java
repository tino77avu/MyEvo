package com.admin.evolucion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EvolucionController {

    @GetMapping("/")
    public String index() {
        return "evolucion4";
    }

    @GetMapping("/evolucion4")
    public String evolucion4() {
        return "evolucion4";
    }

    @GetMapping("/evolucion4/el-cambio")
    public String elCambio() {
        return "el-cambio";
    }

    @GetMapping("/evolucion4/problema")
    public String problema() {
        return "problema";
    }

    @GetMapping("/evolucion4/solucion")
    public String solucion() {
        return "solucion";
    }

    @GetMapping("/evolucion4/como-funciona")
    public String comoFunciona() {
        return "como-funciona";
    }

    @GetMapping("/evolucion4/lo-que-logras")
    public String loQueLogras() {
        return "lo-que-logras";
    }

    @GetMapping("/evolucion4/beneficios")
    public String beneficios() {
        return "beneficios";
    }

    @GetMapping("/evolucion4/ejemplo")
    public String ejemplo() {
        return "ejemplo";
    }

    @GetMapping("/evolucion4/por-que-evo")
    public String porQueEvo() {
        return "por-que-evo";
    }

    @GetMapping("/evolucion4/para-quien")
    public String paraQuien() {
        return "para-quien";
    }

    @GetMapping("/evolucion4/diferencias")
    public String diferencias() {
        return "diferencias";
    }

    @GetMapping("/evolucion4/seguridad")
    public String seguridad() {
        return "seguridad";
    }

    @GetMapping("/evolucion4/faq")
    public String faq() {
        return "faq";
    }

    @GetMapping("/evolucion4/contacto")
    public String contacto() {
        return "contacto";
    }

    @PostMapping("/evolucion4/contacto")
    public String enviarConsulta(
            @RequestParam String nombre,
            @RequestParam String email,
            @RequestParam(required = false) String telefono,
            @RequestParam String consulta,
            RedirectAttributes redirectAttributes) {
        
        // Aquí puedes agregar la lógica para procesar y guardar la consulta
        // Por ejemplo, enviar un email, guardar en base de datos, etc.
        
        // Por ahora, solo redirigimos con un mensaje de éxito
        redirectAttributes.addFlashAttribute("mensaje", "¡Gracias por contactarnos! Te responderemos pronto.");
        return "redirect:/evolucion4/contacto?exito=true";
    }
}
