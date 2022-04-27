package com.alterra.MiniProjectRyanHernawan.service.Recipes;
import com.alterra.MiniProjectRyanHernawan.model.Recipes;
import com.alterra.MiniProjectRyanHernawan.repository.RecipesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class RecipesServiceImpl implements RecipesService{

    private final RecipesRepository recipesRepository;

    @Override
    public List<Recipes> getAllRecipes() {
        return recipesRepository.findAll();
    }

    @Override
    public Recipes CreateNewRecipes(Recipes recipes) {

        return recipesRepository.save(recipes);
    }

    @Override
    public Recipes UpdateRecipes(Recipes recipes) {
        return recipesRepository.save(recipes);
    }


    @Override
    public void deleteRecipesById(Long id) {
        recipesRepository.deleteById(id);
    }
}
