## Factory Method
- インスタンスの生成をTemplate Methodパターンを使って構成したパターン
- 大枠を作るパッケージと、実際のインスタンスをつくる肉付けのためのパッケージを分けておく
    - 今回の例では、frameworkパッケージはidcardパッケージに依存していない、と言える

### メリット
- インスタンス生成の大枠をつくるパッケージを変更せずに、実際のインスタンスに関するパッケージを追加できる

### クラス図
[![Image from Gyazo](https://i.gyazo.com/b5d79d5cbe2f956b960f4c92af6927d1.png)](https://gyazo.com/b5d79d5cbe2f956b960f4c92af6927d1)