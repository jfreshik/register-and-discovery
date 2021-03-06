package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam String name){
        return "Hello " + name;
    }

    @GetMapping("/hello")
    public String hello() {
        return "world";
    }
}
