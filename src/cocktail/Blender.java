/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Blender {
    private List<Ingredient> ingredients;
    private List<String> usedColors;
    private int capacity;
    private int currentVolume;
    private StringBuilder ingredientSummary;
    private Logger logger;
    private int totalCalories;

    public Blender(int capacity, Logger logger) {
        this.ingredients = new ArrayList<>();
        this.capacity = capacity;
        this.currentVolume = 0;
        this.logger = logger;
        this.usedColors = new ArrayList<>();
        this.ingredientSummary = new StringBuilder(); 
        this.totalCalories = 0;
    }

   
public void addIngredient(Ingredient ingredient) throws BlenderException {
    if (currentVolume + ingredient.getVolume() > capacity) {
        throw new BlenderException("Blender capacity exceeded");
    }
    ingredients.add(ingredient);
    currentVolume += ingredient.getVolume();
    totalCalories += ingredient.getCalories();
    ingredientSummary.append(ingredient.getName()).append(" ");  
}

public void removeIngredient(Ingredient ingredient) {
    if (ingredient == null) {
        return;
    }
    if (ingredients.remove(ingredient)) {
        currentVolume -= ingredient.getVolume();
        totalCalories -= ingredient.getCalories();
        rebuildIngredientSummary();
    }
}

private void rebuildIngredientSummary() {
    ingredientSummary.setLength(0); 
    for (Ingredient ingredient : ingredients) {
        ingredientSummary.append(ingredient.getName()).append(" ");
    }

}



private String getIngredientSummaryString() {
    StringBuilder ingredientSummary = new StringBuilder();
    for (Ingredient ingredient : ingredients) {
        ingredientSummary.append(ingredient.getName()).append(" ");
    }
    return ingredientSummary.toString();
}

public String getIngredientSummary() {
    return ingredientSummary.toString();
}


 
public Cocktail blend() throws BlenderException {
    if (ingredients.isEmpty()) {
        throw new BlenderException("Blender is empty. Add ingredients before blending.");
    }

    logger.log("\n----------------\n\nBlending ingredients...");
    RGB color = new RGB(0, 0, 0);
    totalCalories = 0; 
    Map<String, Integer> ingredientCounts = new HashMap<>();

    for (Ingredient ingredient : ingredients) {
        logger.log("Added " + ingredient.getName() + " to the blender");
        color = mixColors(color, ingredient.getColor());
        totalCalories += ingredient.getCalories();
        ingredientCounts.put(ingredient.getName(), ingredientCounts.getOrDefault(ingredient.getName(), 0) + 1);
    }

    if (currentVolume == 0) {
        throw new BlenderException("Nothing to blend. The blender is empty.");
    }

    String hexColor = String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
    logger.log("\n Blending complete. Total calories: " + totalCalories + ", Color: " + hexColor);

    StringBuilder ingredientSummary = new StringBuilder();
for (Map.Entry<String, Integer> entry : ingredientCounts.entrySet()) {
    ingredientSummary.append(entry.getValue()).append(" ").append(entry.getKey());
    if (entry != ingredientCounts.entrySet().iterator().next()) {
        ingredientSummary.append(", ");
    }
}

    int cups = (int) Math.ceil((double) currentVolume / 100);
    logger.log("Ingredients: " + ingredientSummary.toString());
    logger.log("Total Volume: " + currentVolume + "mL");
    logger.log("Cups: " + cups);

    double averageCaloriesPerCup = (double) totalCalories / cups;
    logger.log("Average Calories per Cup: " + averageCaloriesPerCup);

    Cocktail cocktail = new Cocktail(totalCalories, currentVolume, hexColor);

    int remainingVolume = currentVolume;
    logger.log("\n----------------\n");
    for (int i = 1; i <= cups; i++) {
        int cupVolume = Math.min(100, remainingVolume);
        int cupCalories = (int) (averageCaloriesPerCup * cupVolume / 100);
        logger.log("Cup " + i + ": " + cupVolume + "mL -> " + cupCalories + " calories -> " + (remainingVolume - cupVolume) + " mL left");
        remainingVolume -= cupVolume;
    }
    logger.log("\n----------------");
    this.usedColors.add(hexColor);

    ingredients.clear();
    currentVolume = 0;

    return cocktail;
}

public int getTotalCalories() {
    return totalCalories;
}

    public List<String> getUsedColors() {
         return new ArrayList<>(usedColors); 
    }
    



private RGB mixColors(RGB color1, RGB color2) {

    int red = (color1.getRed() + color2.getRed()) / 2;
    int green = (color1.getGreen() + color2.getGreen()) / 2;
    int blue = (color1.getBlue() + color2.getBlue()) / 2;


    red = Math.min(255, Math.max(0, red));
    green = Math.min(255, Math.max(0, green));
    blue = Math.min(255, Math.max(0, blue));

    return new RGB(red, green, blue);
}


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    
    public void clearIngredients() {
    ingredients.clear();
    currentVolume = 0;
    totalCalories = 0;
    ingredientSummary.setLength(0);
}

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    
}