package com.praktyka.database.controller;

import com.praktyka.database.model.Audio;
import com.praktyka.database.model.Sala;
import com.praktyka.database.service.AudioService;
import com.praktyka.database.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SalaService salaService;
    @Autowired
    AudioService audioService;

    @GetMapping(value = "/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        List<Sala> salaList = salaService.findAll();
        List<Audio> audioList = audioService.findAll();
     //   int salaId = 0;
     //   modelAndView.addObject("salaId", salaId);
        modelAndView.addObject("salaList", salaList);
        modelAndView.addObject("audioList", audioList);
        modelAndView.setViewName("home");

        return modelAndView;
    }

    @PostMapping(value = "/")
    public ModelAndView przejdz(@Valid int salaId){
     //   redirect.addAttribute("salaId", salaId);
        return new ModelAndView("redirect:/sala/{salaId}","salaId",salaId);
    }

    @GetMapping(value="/sala/{salaId}")
    public ModelAndView showSala(@PathVariable int salaId) {
        ModelAndView modelAndView = new ModelAndView();
        Sala sala = salaService.findById(salaId);
        List<Audio> audioList = audioService.findAllBySalaId(salaId);
        modelAndView.addObject("audioList", audioList);
        modelAndView.addObject("sala", sala);
        modelAndView.setViewName("sala");

        return modelAndView;
    }

    @PostMapping(value = "/sala/{salaId}")
    public ModelAndView szukaj(@Valid Sala sala){
        ModelAndView modelAndView = new ModelAndView();
        // to nic nie robi narazie ^^
        return modelAndView;
    }

}
