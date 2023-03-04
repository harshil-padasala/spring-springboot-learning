package com.thymeleaf.controllers.Practice;

import com.thymeleaf.entity.Practice.LoginData;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PracticeController {

    @RequestMapping(value = "/learning", method = RequestMethod.GET)
    public String learning(Model model) {
        System.out.println("Handler method learning invoked ... ");

        List<String> names = new ArrayList<>(Arrays.asList("mike", "sam", "paul", "pam", "lion"));

        // Putting data in Model
        model.addAttribute("name", "Harshil");
        model.addAttribute("email", "harshilpadasala@gmail.com");
        model.addAttribute("role", "Student");
        model.addAttribute("number", 1234567890);
        model.addAttribute("list", names);

        return "learning";
    }

    @GetMapping("/condition")
    public String condition(Model model) {
        System.out.println("Handler method condition is invoked ...");
        model.addAttribute("isActive", true);
        model.addAttribute("gender", "F");

        List<Integer> numbers = List.of(11, 64);

        model.addAttribute("list", numbers);

        return "condition";
    }

    @GetMapping("/template")
    public String template(Model model) {
        System.out.println("Handler method template is invoked ...");
        model.addAttribute("subtitle", "Successfully passed data from one template to another template");
        model.addAttribute("title", "Successfully Passed");
        return "template";
    }

    @GetMapping("header")
    public String header() {
        return "header";
    }

    @GetMapping("form")
    public String form(Model model) {
        model.addAttribute("login", new LoginData());
        return "form";
    }

    @PostMapping("/process")
    public String process(@Valid @ModelAttribute("login") LoginData loginData, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
            return "form";
        }
        System.out.println(loginData);
        return "success";
    }
}
