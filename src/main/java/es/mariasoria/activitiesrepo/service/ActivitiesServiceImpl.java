package es.mariasoria.activitiesrepo.service;

import es.mariasoria.activitiesrepo.model.Activity;
import org.omg.CORBA.ACTIVITY_REQUIRED;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

@Service
public class ActivitiesServiceImpl implements ActivitiesService {

    private List<Activity> list = null;

    public ActivitiesServiceImpl(){
        list = new LinkedList<Activity>();

        Activity activity1 = new Activity();
        activity1.setId(1);
        activity1.setName("The Hangman");
        activity1.setMaterial("Chalk, blackboard, eraser");
        activity1.setGoal("Guessing as many words as possible");
        activity1.setAge("7-10");
        activity1.setCategory("Learning");
        activity1.setDescription("This game is to have fun. The Hangman");

        Activity activity2 = new Activity();
        activity2.setId(2);
        activity2.setName("Puzzles");
        activity2.setMaterial("Puzzles");
        activity2.setGoal("Finishing the puzzles as soon as possible");
        activity2.setAge("7-10");
        activity2.setCategory("Learning");
        activity2.setDescription("This game is to have fun. Puzzles");

        Activity activity3 = new Activity();
        activity3.setId(3);
        activity3.setName("Charades");
        activity3.setMaterial("cards with words/movies/verbs...");
        activity3.setGoal("Guessing as many words as possible");
        activity3.setAge("7-10");
        activity3.setCategory("Learning");
        activity3.setDescription("This game is to have fun. Charades");

        Activity activity4 = new Activity();
        activity4.setId(4);
        activity4.setName("Hot potato");
        activity4.setMaterial("balloon...");
        activity4.setGoal("Reply correctly the questions before the balloon explodes");
        activity4.setAge("7-10");
        activity4.setCategory("Learning");
        activity4.setDescription("This game is to have fun. Hot potato");

        list.add(activity1);
        list.add(activity2);
        list.add(activity3);
        list.add(activity4);

    }

    @Override
    public List<Activity> findAll() {
        return list;
    }

    @Override
    public Activity findById(Integer idActivity) {
        for (Activity activity : list) {
            if (activity.getId() == idActivity) {
                return activity;
            }
        }
        return null;
    }

    @Override
    public void saveActivity(Activity activity) {
        list.add(activity);
    }
}
