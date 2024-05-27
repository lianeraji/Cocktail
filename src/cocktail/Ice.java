
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;



public class Ice extends Ingredient {
    public Ice(int amount) {
        super("Ice", amount, new RGB(244, 252, 250), 50); 
    }

    @Override
    public int getCalories() {
        return 0;
    }
}