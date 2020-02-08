package za.co.koboti.onlineregistrationapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/online-reg")
public class OnlineRegistrationAppController {

    @GetMapping("/v1/home")
    public String home() {
        return "Online Registration Application";
    }
}
