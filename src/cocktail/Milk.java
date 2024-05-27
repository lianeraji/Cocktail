/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;


public class Milk extends Ingredient {
    public Milk(int amount) {
        super("Milk", amount, new RGB(255, 255, 255), 100);
    }

    @Override
    public int getCalories() {
        return 50 * getAmount();
    }
    
    
    
}