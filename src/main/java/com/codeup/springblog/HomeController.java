package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

        @GetMapping("/")
        @ResponseBody
        public String land() {
            return "This is a landing page!";
        }
    }

