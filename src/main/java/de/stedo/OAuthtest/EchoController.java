package de.stedo.OAuthtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/echo")
public class EchoController {

    @GetMapping("/{value}")
    public String echo(@PathVariable String value) {
        return value;
    }

}
