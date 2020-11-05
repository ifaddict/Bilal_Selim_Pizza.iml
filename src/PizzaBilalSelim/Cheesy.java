package PizzaBilalSelim;

public class Cheesy extends DecoratorPizza{
    public Cheesy(String name,float price){
     this.name=name;
     this.price=price;
    }
    public Pizza DecoratePizza (Pizza P){



    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public float getPrice(){
        return price;
    }
    @Override
    public void setPrice(float p)
    {

        this.price=p;
    }
    @Override
    public void setName(String n)
    {

        this.name=n;
    }


}
