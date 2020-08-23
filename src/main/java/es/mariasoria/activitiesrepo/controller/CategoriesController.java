package es.mariasoria.activitiesrepo.controller;

import es.mariasoria.activitiesrepo.model.Category;
import es.mariasoria.activitiesrepo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
@RequestMapping(value="/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/index")
    public String showIndex(Model model){
        model.addAttribute("categories", categoriesService.findAll());
        return "categories/listCategories";
    }

    @GetMapping("/create")
    public String createCategory(){
        return "categories/formCategory";
    }

    @PostMapping("/save")
    public String saveCategory(){
        return null;
    }

    @DeleteMapping("/delete")
    public void deleteCategory(){}

    @GetMapping("/edit/{id}")
    public String editCategory(@PathVariable ("id") int idCategory, Model model){
        model.addAttribute("category", categoriesService.findById(idCategory));
        return "categories/editCategory";
    }


}
