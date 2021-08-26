public class Console {

  /**
   * ロジック 序章を表示します。
   */
  public static void start() {
    put("魔王が正解を滅ぼそうとしています。");
    putStatus();
  }

  public static void putStatus() {
    put("----------------------------------");
    put(Sample1.name + "  Lv:" + Sample1.lv + "  HP:" + Sample1.hp + "  " + Sample1.gold + "G");
    put("----------------------------------");
  }

  /** ゲームオーバー画面を表示します。 */
  public static void putGameOver() {
    put(Sample1.name + "はレベルが低く負けてしまいました。");
    put("GAME OVER");
  }

  /** ゲームクリア画面を表示します。 */
  public static void putGameClear() {
    String str = Sample1.name + "は魔王を倒しました!";
    put(str);

    System.out.print("レベル" + Sample1.lv);

    if (Sample1.lv >= 80) {
      put("なので余裕で魔王を倒せました。");
    } else if (Sample1.lv >= 50) {
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
