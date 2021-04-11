package com.recipe.easy.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RecipeIngredientId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long recipeId;

    private Long ingredientId;

    public RecipeIngredientId() {
    }

    public RecipeIngredientId(Long recipeId, Long ingredientId) {
        super();
        this.recipeId = recipeId;
        this.ingredientId = ingredientId;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredientId that = ( RecipeIngredientId ) o;
        return Objects.equals(recipeId, that.recipeId) &&
               Objects.equals(ingredientId, that.ingredientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, ingredientId);
    }

    @Override
    public String toString() {
        return "RecipeIngredientId{" +
               "recipeId=" + recipeId +
               ", ingredientId=" + ingredientId +
               '}';
    }
}
