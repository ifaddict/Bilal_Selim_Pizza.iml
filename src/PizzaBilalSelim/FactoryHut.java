package PizzaBilalSelim;

public class FactoryHut extends AbstractFactory {
    //public static FactoryHut instance=null;
    @Override
   /* public static FactoryHut getFactory(){

    }*/
    static int stockP=2;
    static int stockM=2;
    static int stockF=2;
    static int stockC=2;
    @Override
    public Pizza createPizza(String name) {
               if (name=="Prosciutto" && stockP>0){
                stockP--;
                ProsciuttoHut tmp=new ProsciuttoHut();
            return tmp;
             }
        else if (name=="FruttiDiMare" && stockF>0){
            stockF--;
            FruttiDiMare tmp=new FruttiDiMare();
            tmp.addIngredient(new Olive());
            return tmp;
        }
        else if (name=="Carbonara" && stockC>0){
            stockC--;
            Carbonara tmp=new Carbonara();
            tmp.addIngredient(new Olive());
            return tmp;
        }
        else if (name=="Margherita" && stockM>0){
            stockM--;
            Margherita tmp=new Margherita();
            tmp.addIngredient(new Olive());
            return tmp;
        }
        else{
            return null;
        }
    }
}

//faire comme ProscuittoHut