public class Sample2 {
  public static void main(String[] args) {
    System.out.println("Hello world!!");

    javax.swing.JFrame jf = new javax.swing.JFrame();
    jf.setBounds(50, 100, 750, 400);// 最初の二つが表示したい場所 windowの幅
    jf.setVisible(true);// windowを表示する。
    jf.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);// windowを閉じるとプログラムも終了する

    // 文字の表示
    javax.swing.JLabel jl = new javax.swing.JLabel("Hello world!!");
    jl.setFont(new java.awt.Font(java.awt.Font.SERIF, java.awt.Font.ITALIC, 30));// 文字のサイズ変更 name,style,size 文字の形を変更できる
    jl.setForeground(new java.awt.Color(255, 128, 0));
    // 文字の色を変更java.awt.Color.RED newを付けてColorの後に()内に3つ数字を入れることで自分の好きな色に変更することができる。
    jf.add(jl);
  }
}

// windowサイズが小さい
// 表示場所
// windowを消してもプログラムが終了しない
// Swing
// Jラベルによる文字列の表示