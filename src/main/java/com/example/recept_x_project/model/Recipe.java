package com.example.recept_x_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private enumCategory category;
    private String difficulty;
    public int preparationTime;
    private boolean vegan;
    private boolean lactose_free;
    private boolean gluten_free;
    private String ingredients;
    private String instruction;

    public Recipe () {};

    public Recipe(long id) {
        this.id = id;
    }

    public Recipe(String name, enumCategory category, String difficulty,
                  int preparationTime, boolean vegan, boolean lactose_free,
                  boolean gluten_free, String ingredients, String instruction) {
        this.name = name;
        this.category = category;
        this.difficulty = difficulty;
        this.preparationTime = preparationTime;
        this.vegan = vegan;
        this.lactose_free = lactose_free;
        this.gluten_free = gluten_free;
        this.ingredients = ingredients;
        this.instruction = instruction;
    }
}

