package es.mariasoria.activitiesrepo.service;

import es.mariasoria.activitiesrepo.model.Activity;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ActivitiesServiceImpl implements ActivitiesService {

    private List<Activity> list = null;

    public ActivitiesServiceImpl(){
        /*list = new LinkedList<Activity>();

        Activity activity1 = new Activity();
        activity1.setId(1);
        activity1.setName("The Hangman");
        activity1.setMaterial("Chalk, blackboard, eraser");
        activity1.setGoal("Guessing as many words as possible");
        activity1.setAge("7-10");
        activity1.setDescription("THE HANGMAN - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut cursus nisi. Vivamus sed arcu odio. " +
                "Aenean pharetra justo eu feugiat blandit. Sed dictum mi vitae nulla aliquam placerat. Aliquam non porttitor elit. Donec aliquam efficitur egestas. " +
                "Donec ut risus sit amet lorem ultricies ullamcorper vitae at ligula. Aenean id efficitur enim, condimentum porta nisl. Vivamus a erat lorem. " +
                "Cras elementum bibendum commodo. Mauris id laoreet ex, sed elementum ipsum. Quisque a metus auctor, interdum libero ac, consectetur ex. Praesent " +
                "facilisis dui lorem, luctus finibus magna lacinia sit amet. Praesent mollis elementum libero, vel rhoncus odio.\n" +
                "\n" +
                "Suspendisse lacus quam, varius ultrices ex nec, rhoncus ullamcorper ipsum. Vestibulum at rutrum odio. Praesent convallis arcu in nibh vestibulum, " +
                "in auctor magna rhoncus. Integer quam dolor, pulvinar at vestibulum et, bibendum at mauris. Mauris finibus nisl urna, elementum suscipit enim " +
                "efficitur eget. Nullam ornare risus ut tellus volutpat, id egestas eros aliquet. Sed tempor sodales ipsum et vulputate. Integer vitae ligula vel " +
                "mauris commodo pulvinar. Suspendisse ornare, enim et venenatis elementum, nunc tortor euismod est, luctus pulvinar augue risus sit amet velit. " +
                "Quisque porttitor orci non ante egestas aliquam. Vestibulum lobortis nibh in ante molestie cursus. Phasellus pulvinar sagittis porta. Morbi nisl ex, " +
                "varius non erat dictum, blandit rhoncus augue.");

        Activity activity2 = new Activity();
        activity2.setId(2);
        activity2.setName("Puzzles");
        activity2.setMaterial("Puzzles");
        activity2.setGoal("Finishing the puzzles as soon as possible");
        activity2.setAge("7-10");
        activity2.setDescription("PUZZLES - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut cursus nisi. Vivamus sed arcu odio. " +
                "Aenean pharetra justo eu feugiat blandit. Sed dictum mi vitae nulla aliquam placerat. Aliquam non porttitor elit. Donec aliquam efficitur egestas. " +
                "Donec ut risus sit amet lorem ultricies ullamcorper vitae at ligula. Aenean id efficitur enim, condimentum porta nisl. Vivamus a erat lorem. " +
                "Cras elementum bibendum commodo. Mauris id laoreet ex, sed elementum ipsum. Quisque a metus auctor, interdum libero ac, consectetur ex. Praesent " +
                "facilisis dui lorem, luctus finibus magna lacinia sit amet. Praesent mollis elementum libero, vel rhoncus odio.\n" +
                "\n" +
                "Suspendisse lacus quam, varius ultrices ex nec, rhoncus ullamcorper ipsum. Vestibulum at rutrum odio. Praesent convallis arcu in nibh vestibulum, " +
                "in auctor magna rhoncus. Integer quam dolor, pulvinar at vestibulum et, bibendum at mauris. Mauris finibus nisl urna, elementum suscipit enim " +
                "efficitur eget. Nullam ornare risus ut tellus volutpat, id egestas eros aliquet. Sed tempor sodales ipsum et vulputate. Integer vitae ligula vel " +
                "mauris commodo pulvinar. Suspendisse ornare, enim et venenatis elementum, nunc tortor euismod est, luctus pulvinar augue risus sit amet velit. " +
                "Quisque porttitor orci non ante egestas aliquam. Vestibulum lobortis nibh in ante molestie cursus. Phasellus pulvinar sagittis porta. Morbi nisl ex, " +
                "varius non erat dictum, blandit rhoncus augue.");

        Activity activity3 = new Activity();
        activity3.setId(3);
        activity3.setName("Charades");
        activity3.setMaterial("cards with words/movies/verbs...");
        activity3.setGoal("Guessing as many words as possible");
        activity3.setAge("7-10");
        activity3.setDescription("CHARADES - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut cursus nisi. Vivamus sed arcu odio. " +
                "Aenean pharetra justo eu feugiat blandit. Sed dictum mi vitae nulla aliquam placerat. Aliquam non porttitor elit. Donec aliquam efficitur egestas. " +
                "Donec ut risus sit amet lorem ultricies ullamcorper vitae at ligula. Aenean id efficitur enim, condimentum porta nisl. Vivamus a erat lorem. " +
                "Cras elementum bibendum commodo. Mauris id laoreet ex, sed elementum ipsum. Quisque a metus auctor, interdum libero ac, consectetur ex. Praesent " +
                "facilisis dui lorem, luctus finibus magna lacinia sit amet. Praesent mollis elementum libero, vel rhoncus odio.\n" +
                "\n" +
                "Suspendisse lacus quam, varius ultrices ex nec, rhoncus ullamcorper ipsum. Vestibulum at rutrum odio. Praesent convallis arcu in nibh vestibulum, " +
                "in auctor magna rhoncus. Integer quam dolor, pulvinar at vestibulum et, bibendum at mauris. Mauris finibus nisl urna, elementum suscipit enim " +
                "efficitur eget. Nullam ornare risus ut tellus volutpat, id egestas eros aliquet. Sed tempor sodales ipsum et vulputate. Integer vitae ligula vel " +
                "mauris commodo pulvinar. Suspendisse ornare, enim et venenatis elementum, nunc tortor euismod est, luctus pulvinar augue risus sit amet velit. " +
                "Quisque porttitor orci non ante egestas aliquam. Vestibulum lobortis nibh in ante molestie cursus. Phasellus pulvinar sagittis porta. Morbi nisl ex, " +
                "varius non erat dictum, blandit rhoncus augue.");

        Activity activity4 = new Activity();
        activity4.setId(4);
        activity4.setName("Hot potato");
        activity4.setMaterial("balloon...");
        activity4.setGoal("Reply correctly the questions before the balloon explodes");
        activity4.setAge("7-10");
        activity4.setDescription("HOT POTATO - Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut cursus nisi. Vivamus sed arcu odio. " +
                "Aenean pharetra justo eu feugiat blandit. Sed dictum mi vitae nulla aliquam placerat. Aliquam non porttitor elit. Donec aliquam efficitur egestas. " +
                "Donec ut risus sit amet lorem ultricies ullamcorper vitae at ligula. Aenean id efficitur enim, condimentum porta nisl. Vivamus a erat lorem. " +
                "Cras elementum bibendum commodo. Mauris id laoreet ex, sed elementum ipsum. Quisque a metus auctor, interdum libero ac, consectetur ex. Praesent " +
                "facilisis dui lorem, luctus finibus magna lacinia sit amet. Praesent mollis elementum libero, vel rhoncus odio.\n" +
                "\n" +
                "Suspendisse lacus quam, varius ultrices ex nec, rhoncus ullamcorper ipsum. Vestibulum at rutrum odio. Praesent convallis arcu in nibh vestibulum, " +
                "in auctor magna rhoncus. Integer quam dolor, pulvinar at vestibulum et, bibendum at mauris. Mauris finibus nisl urna, elementum suscipit enim " +
                "efficitur eget. Nullam ornare risus ut tellus volutpat, id egestas eros aliquet. Sed tempor sodales ipsum et vulputate. Integer vitae ligula vel " +
                "mauris commodo pulvinar. Suspendisse ornare, enim et venenatis elementum, nunc tortor euismod est, luctus pulvinar augue risus sit amet velit. " +
                "Quisque porttitor orci non ante egestas aliquam. Vestibulum lobortis nibh in ante molestie cursus. Phasellus pulvinar sagittis porta. Morbi nisl ex, " +
                "varius non erat dictum, blandit rhoncus augue.");

        list.add(activity1);
        list.add(activity2);
        list.add(activity3);
        list.add(activity4);*/
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
