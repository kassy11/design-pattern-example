package builder;

public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.makeTitle("Greeting");
    builder.makeString("朝から夜まで");
    builder.makeItems(new String[] {"おはよう", "こんにちは"});
    builder.makeString("夜に");
    builder.makeItems(new String[] {"山田", "スズキ", "田中"});
    builder.close();
  }
}
