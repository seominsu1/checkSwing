package web.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/members")
public class MemberFormController {


    @GetMapping
    public String registerForm(){
        return "new-form";
    }

    @PostMapping("/save")
    public String save(@RequestParam String username,@RequestParam String nick){
        return "";
    }


}
