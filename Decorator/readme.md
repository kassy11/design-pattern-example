## Decorator
- オブジェクトにどんどんデコレーションを施していくようなデザインパターン
    - 中身のComponentと飾りのDecoratorを同一視する（同じインタフェースを持つ）
- Compositeパターンと再帰的な構造を扱う点で似ているが、違いはその目的
    - 外枠を重ねて機能追加を重ねることに主眼がある
- java.ioパッケージでもDecoratorパターンが使われている
    - ex. `new BuffredReader(new FileReader("test.txt"));`

### メリット
- 中身と飾りが同一視されるので、飾りを重ねていってもインタフェースは少しも隠されない
    - 同じような操作が行える＝インタフェースが透過的である
- 委譲を使うことで中身を変更せずに機能追加を行うことができる

### クラス図
[![Image from Gyazo](https://i.gyazo.com/30dabef2f303bb9544d0596aac995fce.png)](https://gyazo.com/30dabef2f303bb9544d0596aac995fce)