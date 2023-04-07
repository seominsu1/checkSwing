package Member.service.impl;

import Member.service.MemberLoginService;
import config.JwtToken;
import config.JwtTokenProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import vo.Member.RegisterMemberReqDto;
import vo.Member.RegisterMemberResDto;

public class MemeberLoginServiceImpl implements MemberLoginService {


    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final JwtTokenProvider jwtTokenProvider;

    public MemeberLoginServiceImpl(AuthenticationManagerBuilder authenticationManagerBuilder, JwtTokenProvider jwtTokenProvider) {
        this.authenticationManagerBuilder = authenticationManagerBuilder;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public RegisterMemberResDto registerMember(RegisterMemberReqDto inData) {

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(inData.getId(),inData.getPw());      //인증토큰

        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);   //인증 생성

        JwtToken token = jwtTokenProvider.generateToken(authentication);  //검증된 인증정보를 읽어 jwt토큰 생성

        return null;
    }
}
