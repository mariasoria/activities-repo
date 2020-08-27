package es.mariasoria.activitiesrepo.repository;

import es.mariasoria.activitiesrepo.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Category, Integer> {
}
