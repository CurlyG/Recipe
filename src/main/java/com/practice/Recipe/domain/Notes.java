package com.practice.Recipe.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne //if we delete notes object, recipe will remain inside the dataBase
    private Recipe recipe;

    @Lob //(large object storage) as we can store only 2055 characters in the recipeNotes, by adding @Lob JPA allows us to store way more
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
