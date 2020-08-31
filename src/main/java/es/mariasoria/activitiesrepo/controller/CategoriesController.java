package es.mariasoria.activitiesrepo.controller;

import es.mariasoria.activitiesrepo.model.Category;
import es.mariasoria.activitiesrepo.repository.CategoriesRepository;
import es.mariasoria.activitiesrepo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value="/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService serviceCategory;


    @GetMapping("/index")
    public String showIndex(Model model){
        List<Category> lista = serviceCategory.findAll();
        model.addAttribute("categories", lista);
        return "categories/listCategories";
    }

    @GetMapping("/create")
    public String createCategory(Category category){
        return "categories/formCategory";
    }

    @PostMapping("/save")
    public String saveCategory(Category category, BindingResult result, RedirectAttributes attributes){
        if (result.hasErrors()){
            System.out.println("Error in SAVECATEGORY");
            return "categories/formCategory";
        }
        serviceCategory.saveCategory(category);
        attributes.addFlashAttribute("msg", "Category has been saved successfully");
        System.out.println("Category: " + category);
        return "redirect:/categories/index";
    }

    @GetMapping("/edit/{id}")
    public String editCategory(@PathVariable ("id") int idCategory, Model model){
        Category category = serviceCategory.findById(idCategory);
        System.out.println("Category EDIT: " + category);
        model.addAttribute("category", category);
        return "categories/formCategory";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable ("id") int idCategory, RedirectAttributes attributes){
        System.out.println("Borrando registro numero: " + idCategory);
        serviceCategory.deleteCategory(idCategory);
        attributes.addFlashAttribute("msg", "Category has been deleted successfully");
        return "redirect:/categories/index";
    }


}
