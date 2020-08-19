package es.mariasoria.activitiesrepo.model;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Category {

    private Integer id;
    private String nombre;
    private String descripcion;

}
