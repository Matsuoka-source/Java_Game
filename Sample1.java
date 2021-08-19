public class Sample1 {
  // 登場人物
  static String k = "王";
  static String name = "アーサー" + k;

  // レベル
  static int lv = 50;

  public static void main(String[] args) {

    // 文章
    main();

    if (lv <= 20) {
      putGameOver();
    } else {
      putGameClear();
    }
  }

  // ロジック
  // 関数の定義
  static void main() {
    System.out.println("魔王が正解を滅ぼそうとしています。");
    System.out.println(name + "はレベル" + lv + "です。");
  }

  static void putGameOver() {
    System.out.println(name + "はレベルが低く負けてしまいました。");
    System.out.println("GAME OVER");
  }

  // 文字
  static void putGameClear() {
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

  // 倒した時のメッセージ
  static void put(String str) {
    System.out.println(str);
  }
}

// vscodeだとコンパイルをしなくても右上の再生スタートみたいなやつで表示できる。