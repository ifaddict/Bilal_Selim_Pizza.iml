package PizzaBilalSelim;

public class FactoryDominos extends AbstractFactory {

    private static FactoryDominos instance=null;
    public static  FactoryDominos getFactory() {
        if (instance==null) {
            return new FactoryDominos();
        }
        return instance;

    }
    static int stockP=2;
    static int stockM=2;
    static int stockF=2;
    static int stockC=2;
    @Override
    public Pizza createPizza(String name) {
        if (name=="Prosciutto" && stockP>0){
            stockP--;
            Prosciutto tmp=new Prosciutto();

            return tmp;
        }
        else if (name=="FruttiDiMare" && stockF>0){
            stockF--;
            FruttiDiMare tmp=new FruttiDiMare();

            return tmp;
        }
        else if (name=="Carbonara" && stockC>0){
            stockC--;
            Carbonara tmp=new Carbonara();

            return tmp;
        }
        else if (name=="Margherita" && stockM>0){
            stockM--;
            Margherita tmp=new Margherita();

            return tmp;
        }
        else{
            return null;
        }
    }
}
