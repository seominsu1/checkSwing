package vo.Player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@AllArgsConstructor
public class Player {

    private String name;
    private String age;
    private String teamName;
    private String height;
    private String weight;
    private String position;
}
