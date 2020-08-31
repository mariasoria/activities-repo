package es.mariasoria.activitiesrepo.service.db;

import es.mariasoria.activitiesrepo.model.Activity;
import es.mariasoria.activitiesrepo.repository.ActivitiesRepository;
import es.mariasoria.activitiesrepo.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class ActivitiesServiceJpa implements ActivitiesService {

    @Autowired
    private ActivitiesRepository activitiesRepository;

    @Override
    public List<Activity> findAll() {
        return activitiesRepository.findAll();
    }

    @Override
    public Activity findById(Integer idActivity) {
        Optional<Activity> activity = activitiesRepository.findById(idActivity);
        if(activity.isPresent()){
            return activity.get();
        }
        return null;
    }

    @Override
    public void saveActivity(Activity activity) {
        activitiesRepository.save(activity);
    }
}
