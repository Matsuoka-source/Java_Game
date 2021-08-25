public class Sample1 {
  /** 登場人物 */
  static String k = "王";
  static String name = "アーサー" + k;

  /** プレイヤーのレベル */
  static int lv = 20;

  /** プレイヤーのヒットポイント */
  static int hp = 30;

  /** プレイヤーの所持金 */
  static long gold = 5000000000000L;

  public static void main(String[] args) throws java.io.IOException {

    /** 序章を表示 */
    start();

    /** コマンドを表示 */
    putCommand();

    if (hp == 0) {
      return;
    }

    // 魔王を倒しに行く↓
    if (lv <= 20) {/** レベルが20未満の場合 */
      putGameOver(); /* ゲームオーバー画面を表示 */
    } else { /* レベルが20以上の場合 */
      putGameClear(); /* ゲームクリア画面を表示 */
    }
  }

  public static void putCommand() throws java.io.IOException {
    System.out.println("1.魔王を倒しに行く");
    System.out.println("2.修行する");
    System.out.println("3.宿屋に泊まる");
    int c = inputCommand();
    if (c == '1') {
      System.out.println("魔王が現れた");
    } else if (c == '2') {
      java.util.Random r = new java.util.Random(); // 乱数を使用するための記述
      int d = r.nextInt(8);
      lv += 5;
      hp -= d;
      if (hp < 0) {
        hp = 0;
      }
      System.out.println(name + "は" + d + "ポイントのダメージを受けた!");
      System.out.println("レベルが" + lv + "になった。");
      putStatus();
      if (hp == 0) {
        System.out.println("GAME OVER");
      } else {
        putCommand(); // この記述をすることで最初の文字に戻る
      }
    } else if (c == '3') { // 宿屋に泊まる
      if (gold >= 10) {
        hp = lv;
        gold -= 10;
        System.out.println("所持金が足りません。");
      }
      putStatus();
      putCommand();
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

  /**
   * ロジック 序章を表示します。
   */
  public static void start() {
    System.out.println("魔王が正解を滅ぼそうとしています。");
    putStatus();
  }

  public static void putStatus() {
    System.out.println("----------------------------------");
    System.out.println(name + "  Lv:" + lv + "  HP:" + hp + "  " + gold + "G");
    System.out.println("----------------------------------");
  }

  /** ゲームオーバー画面を表示します。 */
  public static void putGameOver() {
    System.out.println(name + "はレベルが低く負けてしまいました。");
    System.out.println("GAME OVER");
  }

  /** ゲームクリア画面を表示します。 */
  public static void putGameClear() {
    String str = name + "は魔王を倒しました!";
    put(str);

    System.out.print("レベル" + lv);

    if (lv >= 80) {
      put("なので余裕で魔王を倒せました。");
    } else if (lv >= 50) {
      put("なので魔王を倒せました");
    } else {
      put("なので魔王に苦戦しました。");
    }

    put("GAME CLEAR!!");
  }

  /**
   * 引数で指定された文字列を表示します。
   * 
   * @param Str 表示対象の文字列
   */
  public static void put(String str) {
    System.out.println(str);
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