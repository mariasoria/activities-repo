package es.mariasoria.activitiesrepo.controller;

import es.mariasoria.activitiesrepo.model.Activity;
import es.mariasoria.activitiesrepo.service.ActivitiesService;
import es.mariasoria.activitiesrepo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value="/activities")
public class ActivitiesController {

    @Autowired
    private ActivitiesService serviceActivity;

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/index")
    public String showIndex(Model model){
        model.addAttribute("activities", serviceActivity.findAll());
        return "activities/index";
    }

    // Displays the view with the details of the activity specified by id
    @GetMapping("/details/{id}")
    public String showActivity(@PathVariable ("id") int idActivity, Model model){
        Activity activity = serviceActivity.findById(idActivity);
        model.addAttribute("activity", activity);
        System.out.println("DETAIL: ACTIVITY -- Category??? " + activity);
        return "detail";
    }

    // Displays the form to create a new activity
    @GetMapping("/create")
    public String createActivity(Activity activity, Model model){
        return "activities/formActivity";
    }

    // Saves the new activity
    @PostMapping("/save")
    public String saveActivity(Activity activity, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            for (ObjectError error: result.getAllErrors()){
                System.out.println("Ocurrio un error: " + error.getDefaultMessage());
            }
            return "activities/formActivity";
        }
        attributes.addFlashAttribute("msg", "Activity has been saved successfully");
        // cuando llegue el objeto activity al controlador
        // se agregara directamente a nuestra lista
        serviceActivity.saveActivity(activity);
        System.out.println("Activity SAVE: " + activity);
        // redirect to the index view
        return "redirect:/activities/index";
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
        return "activities/formActivity";
    }

    @ModelAttribute
    public void setGeneric (Model model){
        model.addAttribute("categories", categoriesService.findAll());
        List<String> ages = Arrays.asList("6-8", "8-10", "10-12", "12-14", "14-");
        model.addAttribute("ages", ages);
    }


}

