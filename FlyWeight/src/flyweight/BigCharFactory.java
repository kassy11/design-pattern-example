package flyweight;

import java.util.HashMap;
import java.util.Map;

// Singletonパターンを使って構成される
public class BigCharFactory {
  // これまで作ったBigCharのインスタンスを管理する
  private final Map<String, BigChar> pool = new HashMap<>();
  private static final BigCharFactory singleton = new BigCharFactory();

  private BigCharFactory() {}

  public static BigCharFactory getInstance() {
    return singleton;
  }

  // FlyWeightパターンの中心となるメソッド
  // 引数で与えられた数字に対応するBigCharインスタンスをつくるが、それがもう存在していれば既存のものを返す
  // 複数スレッドから同時に呼ばれた際に、誤ってnewしてしまうことを防ぐためにsynchronizedにしている
  public synchronized BigChar getBigChar(char charname) {
    BigChar bc = pool.get("" + charname);
    if (bc == null) {
      bc = new BigChar(charname);
      pool.put("" + charname, bc);
    }
    return bc;
  }
}
