package es.mariasoria.activitiesrepo.repository;

import es.mariasoria.activitiesrepo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends JpaRepository<Category, Integer> {
}
