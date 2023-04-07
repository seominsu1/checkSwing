package config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final JwtTokenProvider jwtTokenProvider;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable();                          // 사이트 간 위조 요청(csrf) 금지, 인증된 사용자의 토큰 탈취 방지
        http.httpBasic().disable()                      // http basic authentication 금지
                .formLogin().disable()                  //form authentication 금지
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //jwt 사용하기 때문에 세션 사용 x
                .and()
                .authorizeRequests()
                .antMatchers("/admin").hasRole("ADMIN")    //해당 url 은 관리자 권한 확인
                .antMatchers("/member/login").permitAll()  // 해당url 은 모두 허가
                .and()
                .addFilterBefore(new JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter.class); //UsernamePasswordAuthenticationFilter 전에 직접만든 JwtAuthenticationFilter 실행하겠다.

    }
}
