package PizzaBilalSelim;

public class Margherita extends Pizza {

    Margherita()
    {
        super("Margherita");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
    }
}
