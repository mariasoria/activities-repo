package es.mariasoria.activitiesrepo.model;

import lombok.*;

import javax.persistence.*;

/***
 * This class represents the model for an activity
 */

@Entity
@Table(name="Activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String age; // suitable ages
    private String material; // material necessary
    private String goal; // goal of the activity
    private String description;


    @OneToOne
    @JoinColumn(name="idCategory")
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getIdCategory() {
        return category;
    }

    public void setIdCategory(Category idCategory) {
        this.category = idCategory;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", material='" + material + '\'' +
                ", goal='" + goal + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
