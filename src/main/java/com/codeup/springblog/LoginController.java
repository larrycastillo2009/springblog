package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
        @GetMapping("/login")
        public String loginForm(){
            return "login";
        }

        @PostMapping("/login")
        public String viewLoginInfo(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password,
                                    Model model){
            model.addAttribute("username",username);
            model.addAttribute("password",password);
            return "profile";

        }
    }

