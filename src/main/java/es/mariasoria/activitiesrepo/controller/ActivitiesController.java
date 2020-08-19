package es.mariasoria.activitiesrepo.controller;

import es.mariasoria.activitiesrepo.model.Activity;
import es.mariasoria.activitiesrepo.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/activities")
public class ActivitiesController {

    @Autowired
    private ActivitiesService serviceActivity;

    @GetMapping("/index")
    public String showIndex(Model model){
        model.addAttribute("activities", serviceActivity.findAll());
        return "activities/index";
    }

    @GetMapping("/details/{id}")
    public String showActivity(@PathVariable ("id") int idActivity, Model model){
        model.addAttribute("activity", serviceActivity.findById(idActivity));
        // return la vista detalle
        return "detail";
    }

    @GetMapping("/create")
    public String createActivity(){
        return null;
    }

    @GetMapping("/save")
    public String saveActivity(){
        // redirect to the index view
        return null;
    }

    @DeleteMapping("/delete")
    public void deleteActivity(){}


    @PutMapping("/edit")
    public void editActivity(){}


}

