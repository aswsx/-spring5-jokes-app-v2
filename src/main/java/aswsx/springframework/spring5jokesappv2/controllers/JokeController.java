package aswsx.springframework.spring5jokesappv2.controllers;

import aswsx.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 21/01/2022 - 16:54
 */
@Controller
public class JokeController {
    private final JokeService JokeService;

    public JokeController(JokeService jokeService) {
        JokeService = jokeService;
    }
@RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", JokeService.getJoke());
        return "index";
    }


}
