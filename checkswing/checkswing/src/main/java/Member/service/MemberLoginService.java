package Member.service;

import vo.Member.Member;
import vo.Member.RegisterMemberReqDto;
import vo.Member.RegisterMemberResDto;

public interface MemberLoginService {

    public RegisterMemberResDto registerMember( RegisterMemberReqDto registerMemberReqDto);


}
