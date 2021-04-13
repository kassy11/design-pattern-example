## Adapter
- 提供されているクラスと実装したいクラス（提供されていない）との間に入って、その間を埋めるパターン
    - 提供されているクラスを利用して（継承or委譲）、実装したいクラスの機能を作る
    - 実装したい機能がインタフェースで定義されているときは継承を使い、抽象クラスで定義されているときは委譲を使って実装したいクラスを作る 
    
### メリット
- 既存のクラスを利用できる（一から処理を書かなくても良い）
- バグが発生してもAdapterクラスのみを調べるだけ良くなる
- 