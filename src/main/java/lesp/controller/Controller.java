package lesp.controller;

import lesp.vo.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public Greeting hello() {
        return new Greeting("Hello World");
    }
}
