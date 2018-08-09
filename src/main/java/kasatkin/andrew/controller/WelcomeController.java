package kasatkin.andrew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(name = "/welcome", produces = "application/json")
    public @ResponseBody String welcomePage() {
        return " This is Welcome Page";
    }
}
