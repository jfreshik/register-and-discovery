package hello;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private GreetingClient greetingClient;

    @Autowired
    private UnstableClient unstableClient;

    @GetMapping("/boards")
    @ResponseBody
    public List<Board> getContentList() {

        return Arrays.asList(new Board(1, "hello", "world"),
                new Board(2, "kkkk", "llll"),
                new Board(3, "asdfasdf", "fkdjfslkjdlk"));
    }

    @GetMapping("/greeting/hello")
    public String getGreetingHello() {

        return greetingClient.hello();
    }

    @GetMapping("/greeting/greeting")
    public String getGreeting(@RequestParam String name){

//        Map<String, Object> queryMap = new HashMap<>();
//        queryMap.put("name", name);

        return greetingClient.greeting(name);
    }

    @GetMapping("/greeting/application-name")
    public List<Object> getApplicationName(@RequestParam String name){
        return greetingClient.getApplicationInfo(name);
    }

    @GetMapping("/unstable/hello")
    @HystrixCommand(fallbackMethod = "unstableFailed")
    public String getUnstableHello(){
        return unstableClient.hello();
    }

    public String unstableFailed(){
        return "Failed";
    }
}
