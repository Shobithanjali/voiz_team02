package com.example.voiz_team02.controller;
/*import com.example.voiz_team02.data.RegisterRepository;*/
import com.example.voiz_team02.data.RegisterRepository;
import com.example.voiz_team02.model.Register;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/register")
public class RegisterController {

   /*public String show_register(Model model){
        List<Register> mylist= Arrays.asList(
                new Register("Varnika",999,"varnika@gmail.com","****")
        );
        model.addAttribute("account",mylist);

        return "register";

    }*/

    private RegisterRepository registerrepo;

    public RegisterController(RegisterRepository registerrepo){
        this.registerrepo=registerrepo;
    }


/*@ModelAttribute(name="register")
public Register register(){
    return  new Register();
}*/
@GetMapping
public String show_register(Model model){
    model.addAttribute("register",new Register());
    return "register";
    }
/*
@GetMapping("/register")
public String showRegister(){
    return "register";
}
*/

    @PostMapping
    public String processRegister(@Valid Register register, Errors errors) {
        if (errors.hasErrors()) {
            return "register";
        }
        registerrepo.save(register);
        return "redirect:/";
    }
}
