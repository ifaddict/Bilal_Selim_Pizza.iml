package PizzaBilalSelim;

public class FruttiDiMare extends Pizza {

    FruttiDiMare()
    {
        super("FruttiDiMare");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new Seafood());
    }

}
