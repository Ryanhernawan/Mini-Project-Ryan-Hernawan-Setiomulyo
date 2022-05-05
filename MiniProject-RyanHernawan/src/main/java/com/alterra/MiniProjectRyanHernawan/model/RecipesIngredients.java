package com.alterra.MiniProjectRyanHernawan.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "recipes_ingredients")
public class RecipesIngredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long qty_gram;

    private Date created_at;
    private Date updated_at;


}
