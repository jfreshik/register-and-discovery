package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnstableController {

    @GetMapping("/hello")
    public String failSometimes(){
        return "I'm alive";
    }
}
