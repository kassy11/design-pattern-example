package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;
import java.util.HashMap;

public class IDCardFactory extends Factory {
    private HashMap<String, Integer> table = new HashMap<String, Integer>();
    private Integer tablenum = 1;
    // IDCardのインスタンスを生成する
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, tablenum++);
    }

    @Override
    protected void registerProduct(Product product) {
       IDCard card = (IDCard)product;
       table.put(card.getOwner(), card.getNum());
    }

    public HashMap<String, Integer> getOwners(){
        return table;
    }
}
