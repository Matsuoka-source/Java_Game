public class Sample1 {
  public static void main(String[] args) {

    // 登場人物
    String k = "王";
    String name = "アーサー" + k;

    // レベル
    int lv = 20;

    // 文章
    System.out.println("魔王が正解を滅ぼそうとしています。");
    System.out.println(name + "はレベル" + lv + "です。");

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
}

// vscodeだとコンパイルをしなくても右上の再生スタートみたいなやつで表示できる。