package es.mariasoria.activitiesrepo;

import es.mariasoria.activitiesrepo.model.Activity;
import es.mariasoria.activitiesrepo.model.Category;
import es.mariasoria.activitiesrepo.repository.ActivitiesRepository;
import es.mariasoria.activitiesrepo.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ActivitiesrepoApplication implements CommandLineRunner {

	@Autowired
	private CategoriesRepository categoriesRepository;

	@Autowired
	private ActivitiesRepository activitiesRepository;

	public static void main(String[] args) {
		SpringApplication.run(ActivitiesrepoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("holi");
	}

	private void buscarCategories (){
		Iterable<Category> list = categoriesRepository.findAll();
		for (Category cat : list) {
			System.out.println("Category" + cat);
		}
	}

	private void buscarActivities (){
		Iterable<Activity> list = activitiesRepository.findAll();
		for (Activity act : list) {
			System.out.println("Activity" + act);
		}
	}

	private void guardarCategories(){
		Category cat1 = new Category();
		cat1.setName("Team Building");
		cat1.setDescription("This kind of activities help the group to work as a team.");

		Category cat2 = new Category();
		cat2.setName("Distension");
		cat2.setDescription("This category helps the group to have fun.");

		Category cat3 = new Category();
		cat3.setName("Learning");
		cat3.setDescription("This category has some kind of message to learn.");

		Category cat4 = new Category();
		cat4.setName("Knowledge");
		cat4.setDescription("This category helps to get to know better each other.");

		Category cat5 = new Category();
		cat5.setName("Friendship");
		cat5.setDescription("This category helps the group to know each other deeper.");

		Category cat6 = new Category();
		cat6.setName("Outdoors");
		cat6.setDescription("This category is for activities to be played outdoors.");

		categoriesRepository.save(cat1);
		categoriesRepository.save(cat2);
		categoriesRepository.save(cat3);
		categoriesRepository.save(cat4);
		categoriesRepository.save(cat5);
		categoriesRepository.save(cat6);

		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		System.out.println(cat4);
		System.out.println(cat5);
		System.out.println(cat6);
	}

	private void guardarActivities(){

		Category cat1 = new Category();
		cat1.setId(1);

		Category cat2 = new Category();
		cat1.setId(2);

		Category cat3 = new Category();
		cat1.setId(3);

		Category cat4 = new Category();
		cat1.setId(4);

		Category cat5 = new Category();
		cat1.setId(5);

		Category cat6 = new Category();
		cat1.setId(6);

		/*cat1.setName("Team Building");
		cat2.setName("Distension");
		cat3.setName("Learning");
		cat4.setName("Knowledge");
		cat5.setName("Friendship");
		cat6.setName("Outdoors");*/

		Activity activity1 = new Activity();
		activity1.setName("The Hangman");
		activity1.setMaterial("Chalk, blackboard, eraser");
		activity1.setGoal("Guessing as many words as possible");
		activity1.setAge("7-10");
		activity1.setDescription("THE HANGMAN - ");
		activity1.setIdCategory(cat2);

		Activity activity2 = new Activity();
		activity2.setName("Puzzles");
		activity2.setMaterial("Puzzles");
		activity2.setGoal("Finishing the puzzles as soon as possible");
		activity2.setAge("7-10");
		activity2.setDescription("PUZZLES - ");
		activity2.setIdCategory(cat3);

		Activity activity3 = new Activity();
		activity3.setName("Charades");
		activity3.setMaterial("cards with words/movies/verbs...");
		activity3.setGoal("Guessing as many words as possible");
		activity3.setAge("7-10");
		activity3.setDescription("CHARADES - ");
		activity3.setIdCategory(cat2);

		Activity activity4 = new Activity();
		activity4.setName("Hot potato");
		activity4.setMaterial("balloon...");
		activity4.setGoal("Reply correctly the questions before the balloon explodes");
		activity4.setAge("7-10");
		activity4.setDescription("HOT POTATO - ");
		activity4.setIdCategory(cat4);

		activitiesRepository.save(activity1);
		activitiesRepository.save(activity2);
		activitiesRepository.save(activity3);
		activitiesRepository.save(activity4);
	}

}
