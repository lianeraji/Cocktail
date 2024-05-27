package cocktail;

public class Fruit extends Ingredient {

    public enum FruitType {
        BLUEBERRY("Blueberry", new RGB(70, 65, 150), 20, 40),
        MANGO("Mango", new RGB(255, 165, 0), 60, 70),
        PINEAPPLE("Pineapple", new RGB(255, 245, 71), 50, 80),
        STRAWBERRY("Strawberry", new RGB(251, 66, 67), 50, 60),
        BANANA("Banana", new RGB(255, 251, 208), 70, 70),
        WATERMELON("Watermelon", new RGB (255, 71, 71), 40, 60);

        private final String name;
        private final RGB color;
        private final int calories;
        private final int volume;

        FruitType(String name, RGB color, int calories, int volume) {
            this.name = name;
            this.color = color;
            this.calories = calories;
            this.volume = volume;
        }

        public String getName() {
            return name;
        }

        public RGB getColor() {
            return color;
        }

        public int getCalories() {
            return calories;
        }

        public int getVolume() {
            return volume;
        }
    }

    private final FruitType type;
    private final int amount;

    public Fruit(FruitType type, int amount) {
        super(type.getName(), amount, type.getColor(), type.getCalories() * amount); 
        this.type = type;
        this.amount = amount;
    }

    public FruitType getType() {
        return type;
    }

    @Override
    public int getCalories() {
        return type.getCalories() * amount;
    }

    @Override
    public int getVolume() {
        return type.getVolume() * amount; 
    }

}
