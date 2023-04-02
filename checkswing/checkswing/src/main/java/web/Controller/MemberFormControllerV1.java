package web.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberFormControllerV1 {


    @RequestMapping("/members/new-form")
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }

}
