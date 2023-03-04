package org.mvc.controller;

import org.mvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @ModelAttribute
    public void commonModelAttribute(Model model) {
        model.addAttribute("header", "This is my web site");
        model.addAttribute("footer", "All rights reserved by me");
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    // Method 1 To get data from view(Form)
    @RequestMapping(path = "/request-param", method = RequestMethod.POST)
    public String requestParam(@RequestParam("email") String userEmail,
                               @RequestParam("userName") String userName,
                               @RequestParam("password") String password,
                               Model model) {

        model.addAttribute("email", userEmail);
        model.addAttribute("username", userName);
        model.addAttribute("password", password);

        return "info";
    }

    // Method 2 to get data from view(Form)
    @RequestMapping(path = "/model-attribute", method = RequestMethod.POST)
    public String modelAttribute(@ModelAttribute User user, Model model) {
        return "info";
    }
}
