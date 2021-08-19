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

  // 関数の定義
  static void main() {
    System.out.println("魔王が正解を滅ぼそうとしています。");
    System.out.println(name + "はレベル" + lv + "です。");
  }

  static void putGameOver() {
    System.out.println(name + "はレベルが低く負けてしまいました。");
    System.out.println("GAME OVER");
  }

  static void putGameClear() {
    System.out.println(name + "は魔王を倒しました。");
    if (lv >= 80) {
      System.out.println("レベル" + lv + "なので余裕で魔王を倒せました。");
    } else if (lv >= 50) {
      System.out.println("レベル" + lv + "なので魔王を倒せました");
    } else {
      System.out.println("レベル" + lv + "なので魔王に苦戦しました。");
    }

    System.out.println("GAME CLEAR!!");
  }
}

// vscodeだとコンパイルをしなくても右上の再生スタートみたいなやつで表示できる。