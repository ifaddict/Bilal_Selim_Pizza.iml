package PizzaBilalSelim;

public class Pan extends DecoratorPizza{
    public Pan(){


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
