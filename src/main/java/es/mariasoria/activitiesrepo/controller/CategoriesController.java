package es.mariasoria.activitiesrepo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="/categories")
public class CategoriesController {

    @GetMapping("/index")
    public String showIndex(){
        return "index";
    }

    @GetMapping("/create")
    public String createCategory(){
        return null;
    }

    @GetMapping("/save")
    public String saveCategory(){
        return null;
    }

    @DeleteMapping("/delete")
    public void deleteCategory(){}

    @PutMapping("/edit")
    public void editCategory(){}


}
