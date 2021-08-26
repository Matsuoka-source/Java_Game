public class Sample1 {
  /** 登場人物 */
  static String k = "王";
  static String name = "アーサー" + k;

  /** プレイヤーのレベル */
  static int lv = 20;

  /** プレイヤーのヒットポイント */
  static int hp = 30;

  /** プレイヤーの所持金 */
  static int gold = 10;

  public static void main(String[] args) throws java.io.IOException {

    /** 序章を表示 */
    Console.start();

    /** コマンドを表示 */
    putCommand();

    if (hp == 0) {
      return;
    }

    // 魔王を倒しに行く↓
    if (lv <= 20) {/** レベルが20未満の場合 */
      Console.putGameOver(); /* ゲームオーバー画面を表示 */
    } else { /* レベルが20以上の場合 */
      Console.putGameClear(); /* ゲームクリア画面を表示 */
    }
  }

  public static void putCommand() throws java.io.IOException {
    Console.put("1.魔王を倒しに行く");
    Console.put("2.修行する");
    Console.put("3.宿屋に泊まる");
    switch (inputCommand()) {
      case '1': {
        Console.put("魔王が現れた");
        break;
      }
      case '2': {
        training();
        break;
      }
      case '3': { // 宿屋に泊まる
        if (gold >= 10) {
          hp = lv;
          gold -= 10;
        } else {
          Console.put("所持金が足りません。");// オリジナルで作成表記がないと何が起きているかわからなくなるため作成
        }
        Console.putStatus();
        putCommand();
      }
    }
  }

  // **修行する*/
  public static void training() throws java.io.IOException {
    java.util.Random r = new java.util.Random(); // 乱数を使用するための記述

    // **敵出現(経験値でも採用)*/
    int e = r.nextInt(5) + 1;// 敵の数
    Console.put("敵が" + e + "匹、現れた");

    String m = "٩(ˊᗜˋ*)و";
    String s = "  ";

    // オリジナルで作成 敵の数(r.nextInt()の中身)が増えるたびに
    // if文を書かなくてもいいように調整
    // int i = 1;
    // do {
    // s = s + m;
    // i++;
    // } while (i <= e);
    // put(s);

    // 参考元の物 こちらの方がシンプルなのでこちらを採用
    for (int i = 0; i < e; i++) {
      s = s + m;
    }
    Console.put(s);

    // HPを減らす処理
    int d = r.nextInt(8) + 1;
    hp -= d;
    if (hp < 0) {
      hp = 0;
    }

    Console.put(name + "は" + d + "ポイントのダメージを受けた!");

    // レベルアップの処理
    lv += e;
    Console.put("レベルが" + lv + "になった。");

    Console.putStatus();

    if (hp == 0) {
      Console.put("GAME OVER");
    } else {
      putCommand(); // この記述をすることで最初の文字に戻る
    }
  }

  /**
   * 入力ストリームからデータの次のバイトを読み込みます。 改行コードは無視されます。
   * 
   * @return データの次のバイト。ストリームの終わりに達した場合は-1
   * @exception IOException 入出力エラーが発生した場合 ↓
   */
  public static int inputCommand() throws java.io.IOException {
    // 文字に対応した命令(文字コード)
    int c = System.in.read();
    if (c == 10 || c == 13) {
      return (inputCommand());
    }
    return (c);
  }
}

// javadoc使用時にも-encoding UTF8を記述する必要あり
// /** */で囲む必要あり
// 実行すると複数のファイルが作成される
// index.htmlを開くと
// System.inだと外からの入力をプログラム側に行くということ

// 現状: 2を入力するとなぜか
// 1.魔王を倒しに行く
// 2.修行する
// 2
// レベルが55になった。
// 1.魔王を倒しに行く
// 2.修行する
// 正しい数字が入力されていません。c=13 ←これはエンターキー
// 1.魔王を倒しに行く
// 2.修行する
// 正しい数字が入力されていません。c=10
// 1.魔王を倒しに行く
// 2.修行する*/
// という形に表示されてしまう。

// elseのSystem.out.println()を削除すると
// 正しい数字が,,,は表示されなくなる。

// 表示と入力でわける
// 新しくinputCommand関数を作成し,最後にinputCommand()を追加しで改善

// 8/23関数のリターン文
// public staticの所で {voidだと関数の戻り値がない intだと関数の戻り値がある}

// 戻り値があると変数に代入できる。

// HPを追加
// HPが0になるとGAME OVERになるように変更
// しかしそのあとにGAME CLEARの画面表示をされてしまう
// なのでreturnで返すように変更

// HPとLvを同じ数値に変更

// 8/24無限に宿泊できるのでお金の概念を追加

// 8/25
// int型だと-2100000000~2100000000までしか記述できない
// そのためlong型に変更して元の数字にLを追記
// double型だと小数点まで記述可能
// float型だと有効桁数が少ないので基本的にはdoubleを使っていればいい
// ただし使用するメモリが少なくなり、処理が速くなる

// 乱数の処理を追加

// ソースの整理
// System.out.printlnをputに変更

// 選択肢の2を関数化

// 8/26 お金がなくなった場合宿屋で回復ができず、テキストを表示するように変更
// 敵が何体出現したかを記述 その敵の数に応じてif文で●の数も変わるように変更
// 敵キャラのグラフィック？を変更
// for文で敵の数を後で変更しても変更しなくていいように修正
// 別のファイルにstart以降の関数を移動
// classを使うことで別のファイルの情報を使用可能
// 使う場合には作成した関数の前にclass名をつけることで使用可能