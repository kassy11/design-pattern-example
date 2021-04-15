## Iterator
- ある集合体のクラスをそのクラスに依存しないで、走査するためのパターン

### メリット
- 走査したいクラスの実装とは切り離して、走査することができる
    - Iteratorのインスタンスのメソッドのみで走査することができる
    - 今回のプログラム例ではBookShelfクラスに依存しないで走査している

### クラス図
[![Image from Gyazo](https://i.gyazo.com/f78f16aaf7b70e66f1e62b3ecd2186fe.png)](https://gyazo.com/f78f16aaf7b70e66f1e62b3ecd2186fe)