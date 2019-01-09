package hello;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("greeting-service")
public interface GreetingClient {

//    @RequestMapping(value = "/greeting?name={name}", method = RequestMethod.GET)
    @GetMapping("/greeting?name={name}")
    String greeting(@Param("name") String name);


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @GetMapping("/service-instances/{applicationName}")
    List<Object> getApplicationInfo(@PathVariable("applicationName") String applicationName);
}
