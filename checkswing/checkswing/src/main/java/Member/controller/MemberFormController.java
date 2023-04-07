package Member.controller;


import Member.service.MemberLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.Member.RegisterMemberReqDto;
import vo.Member.RegisterMemberResDto;

@RestController
@RequestMapping(path="/member")
public class MemberFormController {

    private final MemberLoginService memberService;


    @Autowired
    public MemberFormController(MemberLoginService memberService) {
        this.memberService = memberService;
    }


    @PostMapping("/login")
    public RegisterMemberResDto registerMember(@RequestBody RegisterMemberReqDto registerMemberReqDto){
        return memberService.registerMember(registerMemberReqDto);
    }

//    @PostMapping("/save")
//    public String save(@RequestParam String username,@RequestParam String nick){
//        return "";
//    }


}
