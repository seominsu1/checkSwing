package vo.Member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Member {

    private int idx;
    private String name;
    private String pw;
    private String nick;
    private String email;
    private String Address;

}
