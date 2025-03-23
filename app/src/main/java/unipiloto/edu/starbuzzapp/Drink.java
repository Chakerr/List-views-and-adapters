package unipiloto.edu.starbuzzapp;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    // Array de bebidas predefinidas
    public static final Drink[] drinks = {
            new Drink("Latte", "Café expreso con leche vaporizada", R.drawable.latte),
            new Drink("Cappuccino", "Espresso con espuma de leche", R.drawable.cappuccino),
            new Drink("Filtro", "Café filtrado", R.drawable.filter)
    };

    // Constructor
    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}