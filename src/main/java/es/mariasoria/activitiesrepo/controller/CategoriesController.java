package es.mariasoria.activitiesrepo.controller;

import es.mariasoria.activitiesrepo.model.Category;
import es.mariasoria.activitiesrepo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value="/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService serviceCategory;

    @GetMapping("/index")
    public String showIndex(Model model){
        model.addAttribute("categories", serviceCategory.findAll());
        return "categories/listCategories";
    }

    @GetMapping("/create")
    public String createCategory(){
        return "categories/formCategory";
    }

    @PostMapping("/save")
    public String saveCategory(Category category, RedirectAttributes attributes){
        serviceCategory.saveCategory(category);
        System.out.println("Category: " + category);
        return "redirect:/categories/index";
    }

    @DeleteMapping("/delete")
    public void deleteCategory(){}

    @GetMapping("/edit/{id}")
    public String editCategory(@PathVariable ("id") int idCategory, Model model){
        model.addAttribute("category", serviceCategory.findById(idCategory));
        return "categories/editCategory";
    }

    @PutMapping("/update")
    public String updateCategory(Category category){ return null; }
}
