package com.practice.Recipe.repositories;

import com.practice.Recipe.domain.Category;
import com.practice.Recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

  //  Optional<UnitOfMeasure> findByDescription(String description);


}
