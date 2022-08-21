package com.example.recept_x_project.repo;

import com.example.recept_x_project.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface recipeRepo extends CrudRepository<Recipe, Long> {



}
