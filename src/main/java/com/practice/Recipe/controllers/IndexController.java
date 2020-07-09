package com.practice.Recipe.controllers;

import com.practice.Recipe.domain.Category;
import com.practice.Recipe.domain.UnitOfMeasure;
import com.practice.Recipe.repositories.CategoryRepository;
import com.practice.Recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.attribute.standard.MediaSize;
import java.util.Optional;

@Controller
public class IndexController {

  //  private CategoryRepository categoryRepository;
  //  private UnitOfMeasureRepository unitOfMeasureRepository;

   // public IndexController(UnitOfMeasureRepository unitOfMeasureRepository) {
       // this.categoryRepository = categoryRepository;
       // this.unitOfMeasureRepository = unitOfMeasureRepository;
   // }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){

      //  Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
       // Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Tablespoon");

       // System.out.println("Category Id is "+categoryOptional.get().getId());
      //  System.out.println("UOM Id is "+unitOfMeasureOptional.get().getId());

        return "index";
    }

}
