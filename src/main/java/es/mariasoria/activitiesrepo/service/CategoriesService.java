package es.mariasoria.activitiesrepo.service;

import es.mariasoria.activitiesrepo.model.Category;

import java.util.List;

public interface CategoriesService {

    List<Category> findAll();

    Category findById(Integer idCategory);

    void saveCategory(Category category);

    void deleteCategory(Integer idCategory);
}
