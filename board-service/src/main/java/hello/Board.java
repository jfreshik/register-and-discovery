package hello;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;

@Getter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Board {

    private int id;

    private String title;

    private String content;

    public Board(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
