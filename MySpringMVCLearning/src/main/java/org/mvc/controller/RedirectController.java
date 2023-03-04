package org.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
    @RequestMapping("/form")
    public String contact() {
        return "redirect:/success";
    }

    @RequestMapping("/success")
    public String success() {
        return "success";
    }

    @RequestMapping("/redirect")
    public RedirectView redirect() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://google.com");
        return redirectView;
    }
}
//