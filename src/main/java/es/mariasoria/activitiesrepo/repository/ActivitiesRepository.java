package es.mariasoria.activitiesrepo.repository;

import es.mariasoria.activitiesrepo.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ActivitiesRepository extends JpaRepository<Activity, Integer> {
}
