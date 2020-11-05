package PizzaBilalSelim;

public class Ingredient implements PizzaComponent {
    private String name;
    private float price;


    public Ingredient(String name, float price) {
        this.name=name;
        this.price=price;

    }
    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public float getPrice() {

        return price;
    }

    @Override
    public void setPrice(float price) {

    this.price = price;
    }

    @Override
    public String toString()
    {

        return (this.name+" "+this.price.toString());
    }

}