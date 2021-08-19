public class Sample1 {
  // 登場人物
  static String k = "王";
  static String name = "アーサー" + k;

  // レベル
  static int lv = 20;

  public static void main(String[] args) {

    // 文章
    main();

    if (lv <= 20) {
      System.out.println(name + "はレベルが低く負けてしまいました。");
      System.out.println("GAME OVER");
    } else {
      System.out.println(name + "は魔王を倒しました。");
      if (lv >= 80) {
        System.out.println("レベル" + lv + "なので余裕で倒せました。");
      } else if (lv >= 50) {
        System.out.println("レベル" + lv + "なので倒せました");
      } else {
        System.out.println("レベル" + lv + "なので苦戦しました。");
      }

      System.out.println("Game CLEAR!!");
    }
  }

  // 関数の定義
  static void main() {
    System.out.println("魔王が正解を滅ぼそうとしています。");
    System.out.println(name + "はレベル" + lv + "です。");
  }
}

// vscodeだとコンパイルをしなくても右上の再生スタートみたいなやつで表示できる。