package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {
    private String owner;
    private  Integer num;
    // パッケージプライベードなコンストラクタにすることで、frameworkからの依存をなくしている
    IDCard(String owner, Integer num){
        System.out.println(owner + "(" + num + ")" + "のカードを作ります");
        this.owner = owner;
        this.num = num;
    }
    @Override
    public void use() {
        System.out.println(owner +  "(" + num + ")"  + "のカードを使います");
    }
    public  String getOwner() {
        return this.owner;
    }
    public Integer getNum(){
        return this.num;
    }
}
