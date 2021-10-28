package biz.rookware.springjokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.rookware.springjokeapp.models.Joke;
import biz.rookware.springjokeapp.services.JokeService;

@Controller
@RequestMapping("/")
public class JokeController {
    
    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    String getJoke(Model model) {
        
        Joke joke = new Joke(jokeService.getJoke());
        model.addAttribute("joke", joke);
        return "index";
    }
}
