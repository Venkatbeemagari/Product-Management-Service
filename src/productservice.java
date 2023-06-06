import java.util.ArrayList;
import java.util.List;
public class productservice {
    public List<product> products=new ArrayList<>();

    public void addproduct(product p){
        products.add(p);
    }
    //delete a product from list
    public void deleteproduct(String name){
        for (product x:products
             ) {
            if(x.getName().equals(name)){
                products.remove(x);
            }
        }
    }
//get all products
    public List<product> getProducts() {
        return products;
    }
//get single
    public product getsingle(String name){
        for(product x:products){
            if(x.getName().equals(name)){
                return x;
            }
        }
        return null;
    }
//specific text in whole list
    public List<product> getspecific(String text){
        List<product> spe=new ArrayList<>();
        for(product x:products){
            if(x.getName().contains(text)|| x.getPlace().contains(text)||x.getType().contains(text)){
                spe.add(x);
            }
        }
        return spe;
    }
    public List<product> expired(int year){
        List<product> exp=new ArrayList<>();
        for (product x:products
             ) {
            if(x.getWarranty()<year){
                exp.add(x);
            }

        }
        return exp;
    }
}
