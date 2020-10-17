package ar.com.dds;

import ar.com.dds.domain.Persona;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Controlador {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        String mensaje = "Mensaje con Thymeleaf";

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("55443322");

        Persona persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kgomez@mail.com");
        persona2.setTelefono("13229900");

//        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona);
        List<Persona> personas = Arrays.asList(persona, persona2);

        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
