package com.practice.Recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe") //as the relationship is bidirectional mappedBy should be used to specify the property of the entity that is the owner of the relationship
    private Set<Ingredient> ingredients; //used Set because ingredients are unique

    @Lob //(large object storage) it will create our image as Binary Large Object field
    private Byte[] image;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @OneToOne(cascade = CascadeType.ALL) //If we delete a recipe it will delete the note as well
    private Notes notes;

    @ManyToMany
    @JoinTable(name = "recipe_category", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;

    public Recipe() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Recipe;
    }

}
