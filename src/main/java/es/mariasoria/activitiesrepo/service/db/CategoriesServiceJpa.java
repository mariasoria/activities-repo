package es.mariasoria.activitiesrepo.service.db;

import es.mariasoria.activitiesrepo.model.Category;
import es.mariasoria.activitiesrepo.repository.CategoriesRepository;
import es.mariasoria.activitiesrepo.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class CategoriesServiceJpa implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public List<Category> findAll() {
        return categoriesRepository.findAll();
    }

    @Override
    public Category findById(Integer idCategory) {
        Optional<Category> category = categoriesRepository.findById(idCategory);
        if(category.isPresent()){
            System.out.println("Category: " + category);
            return category.get();
        }
        return null;
    }

    @Override
    public void saveCategory(Category category) {
        categoriesRepository.save(category);
    }

    @Override
    public void deleteCategory(Integer idCategory) {
        categoriesRepository.deleteById(idCategory);
    }
}
