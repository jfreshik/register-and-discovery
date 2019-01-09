package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BoardController {

    @GetMapping("/boards")
    @ResponseBody
    public List<Board> getContentList(){

        return Arrays.asList(new Board(1, "hello", "world"),
                new Board(2, "kkkk", "llll"),
                new Board(3, "asdfasdf", "fkdjfslkjdlk"));
    }

}
