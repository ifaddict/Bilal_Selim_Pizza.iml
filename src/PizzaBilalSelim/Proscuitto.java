package PizzaBilalSelim;

public class Prosciutto extends Pizza{


    Prosciutto() {
        super("Prosciutto");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new Ham());
    }
}
