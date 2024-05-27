/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocktail;

public class Cocktail {
    private int calories;
    private int volume;
    private String color;

    public Cocktail(int calories, int volume, String color) {
        this.calories = calories;
        this.volume = volume;
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public int getVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }
}
