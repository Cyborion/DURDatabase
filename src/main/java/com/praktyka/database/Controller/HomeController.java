package com.praktyka.database.Controller;

import com.praktyka.database.model.Audio;
import com.praktyka.database.model.Sala;
import com.praktyka.database.service.AudioService;
import com.praktyka.database.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
        modelAndView.addObject("salaList", salaList);
        modelAndView.addObject("audioList", audioList);
        modelAndView.setViewName("home");

        return modelAndView;
    }

}
