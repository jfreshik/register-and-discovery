package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "unstable-service")
public interface UnstableClient {

    @GetMapping("/hello")
    String hello();
}
