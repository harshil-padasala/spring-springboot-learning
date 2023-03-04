package org.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Annotation for telling the Spring that this is Controller.
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {

        // Adding data model object
        addModelData(model);

        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model) {

        // Adding data model object
        addModelData(model);

        // returns view name and after that viewResolver resolve the name of the view and
        // at last it returns the index.jsp
        return "home";
    }


    @RequestMapping("/pathvariable/{id}/{word}")
    public String pathVariable(@PathVariable("id") int id, @PathVariable("word") String word) {
        System.out.println(id);
        System.out.println(word);
        System.out.println("--------");
        return "success";
    }

    @RequestMapping("/help")
    public ModelAndView help() {

        // setting data
        ModelAndView modelAndView = new ModelAndView();
        // function call for setting data
        addModelAndViewData(modelAndView);

        // setting view file
        modelAndView.setViewName("help");

        return modelAndView;
    }

    public void addModelData(Model model) {
        model.addAttribute("str", "Spring MVC tutorial");
        model.addAttribute("int1", 11);
        List<String> car = new ArrayList<>();
        car.add("McLaren");
        car.add("Bugatti");
        car.add("Lamborghini");
        car.add("Roles Royce");

        model.addAttribute("list", car);
    }

    public void addModelAndViewData(ModelAndView modelAndView) {
        modelAndView.addObject("str", "String");
        modelAndView.addObject("int", 11);
        List<String> car = new ArrayList<>();
        car.add("McLaren");
        car.add("Bugatti");
        car.add("Lamborghini");
        car.add("Roles Royce");
        modelAndView.addObject("list", car);

        LocalDateTime time = LocalDateTime.now();
        modelAndView.addObject("time", time);
    }
}
