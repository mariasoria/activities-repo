package es.mariasoria.activitiesrepo.controller;

import es.mariasoria.activitiesrepo.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // Displays the list of activities

    @Autowired
    private ActivitiesService activitiesService;

    @GetMapping("/index")
    public String showIndex(Model model){
        model.addAttribute("activities", activitiesService.findAll());
        return "activities/index";
    }

}
