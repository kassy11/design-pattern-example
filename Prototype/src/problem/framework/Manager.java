package problem.framework;

import java.util.HashMap;

// Productインタフェースを利用して、インスタンスの複製を行うクラス
public class Manager {
  private HashMap<String, Object> showcase = new HashMap<String, Object>();

  public void register(String name, Product prototype) {
    showcase.put(name, prototype);
  }

  public Product create(String protoname) {
    Product p = (Product) showcase.get(protoname);
    return p.createClone();
  }
}
