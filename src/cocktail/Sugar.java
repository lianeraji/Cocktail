/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

public class Sugar extends Ingredient {
    public Sugar(int amount) {
        super("Sugar", amount, new RGB(255, 255, 255), 20); 
    }

    @Override
    public int getCalories() {
        return 10 * getAmount();
    }
}