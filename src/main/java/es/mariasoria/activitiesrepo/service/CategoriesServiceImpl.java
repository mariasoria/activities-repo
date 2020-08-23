package es.mariasoria.activitiesrepo.service;

import es.mariasoria.activitiesrepo.model.Category;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService{

    private List<Category> list = null;

    public CategoriesServiceImpl(){
        list = new LinkedList<Category>();

        Category cat1 = new Category();
        cat1.setId(1);
        cat1.setName("Team Building");
        cat1.setDescription("This kind of activities help the group to work as a team.");

        Category cat2 = new Category();
        cat2.setId(2);
        cat2.setName("Distension");
        cat2.setDescription("This category helps the group to have fun.");

        Category cat3 = new Category();
        cat3.setId(3);
        cat3.setName("Learning");
        cat3.setDescription("This category has some kind of message to learn.");

        Category cat4 = new Category();
        cat4.setId(4);
        cat4.setName("Knowledge");
        cat4.setDescription("This category helps to get to know better each other.");

        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        list.add(cat4);

    }

    @Override
    public List<Category> findAll() {
        return list;
    }

    @Override
    public Category findById(Integer idCategory) {
        for (Category category : list) {
            if(category.getId() == idCategory){
                return category;
            }
        }
        return null;
    }

    @Override
    public void saveCategory(Category category) {
        list.add(category);
    }
}
