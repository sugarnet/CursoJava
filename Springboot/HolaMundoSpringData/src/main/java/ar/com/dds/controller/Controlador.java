package ar.com.dds.controller;

import ar.com.dds.dao.PersonaDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Controlador {
    
    @Autowired
    private PersonaDAO personaDAO;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personaDAO.findAll());
        return "index";
    }
}
