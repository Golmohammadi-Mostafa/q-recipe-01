package com.abn.service;


import com.abn.dto.RecipeRequestDTO;
import com.abn.entity.Recipe;

import java.util.List;

public interface RecipeService {
    Recipe create(RecipeRequestDTO recipeDTO, String username);

    void delete(Long id);

    Recipe update(RecipeRequestDTO recipeDTO, Long id);

    List<Recipe> retrieve(String searchRecipe, String searchIngredient, int page, int size);
}
