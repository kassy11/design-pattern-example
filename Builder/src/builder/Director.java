package builder;

// Builderクラスのメソッドを使って、具体的な文書を作る
// 実際に動いてるいるがHTMLBuilderなのかTextBuilderなのか関係なく動く
public class Director {
  private Builder builder;

  // ここに実際に渡されるのはBuilderクラスのサブクラスのインスタンス
  public Director(Builder builder) {
    this.builder = builder;
  }

  // 文書を構築する
  public void construct() {
    builder.makeTitle("Greeting");
    builder.makeString("朝から夜まで");
    builder.makeItems(new String[] {"おはよう", "こんにちは"});
    builder.makeString("夜に");
    builder.makeItems(new String[] {"山田", "スズキ", "田中"});
    builder.close();
  }
}
