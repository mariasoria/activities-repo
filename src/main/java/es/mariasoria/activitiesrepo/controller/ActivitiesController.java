package es.mariasoria.activitiesrepo.controller;

import es.mariasoria.activitiesrepo.model.Activity;
import es.mariasoria.activitiesrepo.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value="/activities")
public class ActivitiesController {

    @Autowired
    private ActivitiesService serviceActivity;

    // Displays the view with the details of the activity specified by id
    @GetMapping("/details/{id}")
    public String showActivity(@PathVariable ("id") int idActivity, Model model){
        model.addAttribute("activity", serviceActivity.findById(idActivity));
        return "detail";
    }

    // Displays the form to create a new activity
    @GetMapping("/create")
    public String createActivity(Activity activity){
        return "activities/formActivity";
    }

    // Saves the new activity
    @PostMapping("/save")
    public String saveActivity(Activity activity, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            return "activities/formActivity";
        }
        attributes.addFlashAttribute("msg", "Activity saved");
        // cuando llegue el objeto activity al controlador
        // se agregara directamente a nuestra lista
        serviceActivity.saveActivity(activity);
        System.out.println("Activity: " + activity);
        // redirect to the index view
        return "redirect:/index";
    }

    // @DeleteMapping("/delete")
    @GetMapping("/delete/{id}")
    public void deleteActivity(@PathVariable ("id") int idActivity){

    }

    // Displays the view to edit the activity specified by id
    @GetMapping("/edit/{id}")
    public String editActivity(@PathVariable ("id") int idActivity, Model model){
        model.addAttribute("activity", serviceActivity.findById(idActivity));
        // add each element of the model to a variable??? filling the form
        return "activities/editActivity";
    }


}

