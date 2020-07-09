package com.practice.Recipe.repositories;

import com.practice.Recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository <Recipe, Long> {
}
