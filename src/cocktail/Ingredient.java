/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

public abstract class Ingredient {
    private final String name;
    private final int amount;
    private final RGB color;
    private final int volume;

    public Ingredient(String name, int amount, RGB color, int volume) {
        this.name = name;
        this.amount = amount;
        this.color = color;
          this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public RGB getColor() {
        return color;
    }

    public abstract int getCalories();
}

