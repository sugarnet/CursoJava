package ar.com.dds;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controlador {
    @GetMapping("/")
    public String init() {
        log.info("Executing method init() in InitController");
        return "Hello World!!!";
    }
}
