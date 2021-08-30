import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Color;

public class Sample2 {
  public static void main(String[] args) {
    System.out.println("Hello world!!");

    // ウィンドウフレームを作成、表示
    JFrame jf = new JFrame();
    jf.setBounds(50, 100, 750, 400);// 最初の二つが表示したい場所 windowの幅
    jf.setVisible(true);// windowを表示する。
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// windowを閉じるとプログラムも終了する

    // 文字の表示

    // 親パネルを作成し、親パネルに張り付け
    JPanel jp = new JPanel();
    jp.setBackground(Color.BLACK);
    jf.add(jp);

    // ラベルを作成し、親パネルに張り付け
    JLabel jl = new JLabel("魔王が世界を滅ぼそうとしています!!");
    Font f = new Font(Font.MONOSPACED, Font.BOLD, 40);
    jl.setFont(f);// 文字のサイズ変更 name,style,size 文字の形を変更できる
    jl.setForeground(new Color(255, 128, 0));
    // 文字の色を変更java.awt.Color.RED newを付けてColorの後に()内に3つ数字を入れることで自分の好きな色に変更することができる。
    jp.add(jl);
    // jlとjpの順番が反対になるとどちらかが下に行って見えなくなることあり

    // パネルを作成し、親パネルに貼り付け
    JPanel jpChild = new JPanel();
    jpChild.setBackground(Color.RED);
    jp.add(jpChild);

    // ラベルを作成し、子パネルに張り付け
    JLabel jlChild = new JLabel("アーサー王　Lv99　HP999/999");
    jlChild.setFont(f);// 文字のサイズ変更 name,style,size 文字の形を変更できる
    jlChild.setForeground(Color.WHITE);
    // 文字の色を変更java.awt.Color.RED newを付けてColorの後に()内に3つ数字を入れることで自分の好きな色に変更することができる。
    jpChild.add(jlChild);

  }
}

// windowサイズが小さい
// 表示場所
// windowを消してもプログラムが終了しない
// Swing
// Jラベルによる文字列の表示
// 先頭にimport javax.swingと記述するとmainの中でjavax.swingを省略できる
// javax.swing.*;だと広範囲だけど後でどこに使用されているのかわかりにくい
// そのため*を消してそのあとのJFrameやJLabelを記述して、元あった場所はjavax.swingの省略可能

// 8/30
// 部品の重ね合わせ
// First Seed Materialが閉鎖されているので別サイトを探す
// 現在画像をどうすればいいか考案中