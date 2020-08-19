package es.mariasoria.activitiesrepo.service;

import es.mariasoria.activitiesrepo.model.Activity;

import java.util.List;

public interface ActivitiesService {

    List<Activity> findAll();

    Activity findById(Integer idActivity);

    void saveActivity(Activity activity);

}
