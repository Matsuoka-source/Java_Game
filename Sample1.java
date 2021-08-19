public class Sample1 {
  public static void main(String[] args) {

    // 登場人物
    String k = "王";
    String name = "アーサー" + k;

    // レベル
    int lv = 50;

    // 文章
    System.out.println("魔王が正解を滅ぼそうとしています。");
    System.out.println(name + "はレベル" + lv + "の強者です。");
    System.out.println(name + "は魔王を倒しました。");
    System.out.println("Game CLEAR!!");
  }
}

// vscodeだとコンパイルをしなくても右上の再生スタートみたいなやつで表示できる。