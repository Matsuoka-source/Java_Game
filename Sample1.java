public class Sample1 {
  /** 登場人物 */
  static String k = "王";
  static String name = "アーサー" + k;

  /** プレイヤーのレベル */
  static int lv = 20;

  public static void main(String[] args) throws java.io.IOException {

    /** 序章を表示 */
    start();

    putCommand();

    /** レベルが20未満の場合 */
    if (lv <= 20) {
      putGameOver(); /* ゲームオーバー画面を表示 */
    } else { /* レベルが20以上の場合 */
      putGameClear(); /* ゲームクリア画面を表示 */
    }
  }

  public static void putCommand() throws java.io.IOException {
    System.out.println("1.魔王を倒しに行く");
    System.out.println("2.修行する");

    // 文字に対応した命令(文字コード)
    int c = System.in.read();

    if (c == '2') {
      lv += 5;
      System.out.println("レベルが" + lv + "になった。");
    }
  }

  /**
   * ロジック 序章を表示します。
   */
  public static void start() {
    System.out.println("魔王が正解を滅ぼそうとしています。");
    System.out.println(name + "はレベル" + lv + "です。");
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