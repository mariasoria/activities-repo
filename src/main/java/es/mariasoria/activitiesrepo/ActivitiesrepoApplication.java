package es.mariasoria.activitiesrepo;

import es.mariasoria.activitiesrepo.model.Category;
import es.mariasoria.activitiesrepo.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivitiesrepoApplication implements CommandLineRunner {

	@Autowired
	private CategoriesRepository categoriesRepository;

	public static void main(String[] args) {
		SpringApplication.run(ActivitiesrepoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// guardar();
		System.out.println("holi");
	}

	private void guardar(){
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



}
