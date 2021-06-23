package decorator;

// 飾り側だがDisplayを継承しているので、中身のStringDisplayなどと同じメソッドを持つ
public abstract class Border extends Display {
  // 中身のインスタンス
  protected Display display;

  protected Border(Display display) {
    this.display = display;
  }
}
