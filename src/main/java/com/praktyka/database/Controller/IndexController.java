package com.praktyka.database.controller;

import com.praktyka.database.model.Sala;
import com.praktyka.database.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private SalaRepository salaRepository;

    @GetMapping(value = "/index")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        List<Sala> salaList = salaRepository.findAll();
        modelAndView.addObject("salaList",salaList);
        modelAndView.setViewName("index");

        return modelAndView;
    }
}
