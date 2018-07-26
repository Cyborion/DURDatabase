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

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SalaService salaService;
    @Autowired
    AudioService audioService;

    @GetMapping(value = "/")
    public ModelAndView home(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        List<Sala> salaList = salaService.findAll();
        List<Audio> audioList = audioService.findAll();
        modelAndView.addObject("salaList", salaList);
        modelAndView.addObject("audioList", audioList);
        modelAndView.setViewName("home");

        return modelAndView;
    }

    @PostMapping(value = "/")
    public ModelAndView przejdz(@Valid int salaId){
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
    public ModelAndView przejdzAddAudio(@PathVariable int salaId ){
        return new ModelAndView("redirect:/sala/{salaId}/audioAdd");
    }


    @GetMapping(value = "/sala/{salaId}/audioAdd")
    public ModelAndView addAudio(@PathVariable int salaId){
        ModelAndView modelAndView = new ModelAndView();
        Audio audio = new Audio();
        modelAndView.addObject("audio",audio);
        modelAndView.setViewName("audioAdd");
        return modelAndView;
    }

    @PostMapping(value = "/sala/{salaId}/audioAdd")
    public ModelAndView saveAudio(@Valid Audio audio, @PathVariable int salaId){
        audio.setSala(salaService.findById(salaId));
        audioService.addAudio(audio);
        ModelAndView modelAndView = new ModelAndView("redirect:/sala/{salaId}");
        return modelAndView;
    }

    @GetMapping(value = "/sala/{salaId}/audioModify/{audioId}")
    public ModelAndView modifyAudio(@PathVariable int salaId,@PathVariable("audioId") Audio audio){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("audio",audio);
        modelAndView.setViewName("audioModify");
        return modelAndView;
    }

    @PostMapping(value = "/sala/{salaId}/audioModify/{audioId}")
    public ModelAndView updateAudio(@PathVariable int salaId,@PathVariable("audioId") @Valid Audio audio){
        audioService.addAudio(audio); // nie zmienia wartosci pol
        ModelAndView modelAndView = new ModelAndView("redirect:/sala/{salaId}");
        return modelAndView;
    }

}
