package vo.Member;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterMemberReqDto {

    private String name;
    private String id;

    private String pw;

    private String nick;

    private String email;

    private String address;

}
