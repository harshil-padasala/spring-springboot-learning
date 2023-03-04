package org.mvc.controller;

import org.mvc.model.ComplexForm1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormControllers {

    // handler method to display form
    @RequestMapping(path = "/complex_form1")
    public String complexForm1() {
        return "cform1";
    }

    // handler form method to process form data
    @RequestMapping(path = "handle-complex-form", method = RequestMethod.POST)
    public String processComplexForm1(@ModelAttribute("cform") ComplexForm1 form, BindingResult result, Model model) {

        // Redirecting at same page if any error occurred
        if (result.hasErrors()) {
            return "cform1";
        }

        System.out.println(form);
        model.addAttribute("form", form);
        return "success";
    }
}