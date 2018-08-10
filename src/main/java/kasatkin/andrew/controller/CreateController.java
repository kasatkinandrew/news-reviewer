package kasatkin.andrew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CreateController {

    @GetMapping(name = "/welcome", produces = "application/json")
    public @ResponseBody String welcomePage() {

        return "This is Welcome Page";
    }
}
