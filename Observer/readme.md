## Observer
- 観察対象の状態を観察するパターン
    - 観察者は能動的に観察するというわけではなく、観察される側からの通知を受動的に待つので、「Public-Subscribeパターン」とも言われる
    - MVCパターンのModelとViewの関係もObserverとSubjectの関係に対応する
        - ModelがSubjectで、ViewがObserverで変更に応じてビューを変える
### 目的
- 観察対象の状態を観察し、状態変化に応じた処理を記述できるようにする

### メリット
- 観察される側、観察する側の両方ともを入れ替え可能であること（両方とも抽象化されている）

### クラス図
[![Image from Gyazo](https://i.gyazo.com/8dae792a4d3f0072ed868b644554d257.png)](https://gyazo.com/8dae792a4d3f0072ed868b644554d257)