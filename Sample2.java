public class Sample2 {
  public static void main(String[] args) {
    System.out.println("Hello world!!");

    javax.swing.JFrame jf = new javax.swing.JFrame();
    jf.setBounds(50, 100, 750, 400);// 最初の二つが表示したい場所 windowの幅
    jf.setVisible(true);// windowを表示する。
    jf.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);// windowを閉じるとプログラムも終了する
    
    // 文字の表示
    javax.swing.JLabel jl = new javax.swing.JLabel("Hello world!!");
    jl.setFont(new java.awt.Font(null,0,30));//文字のサイズ変更
    jf.add(jl);
  }
}

// windowサイズが小さい
// 表示場所
// windowを消してもプログラムが終了しない
// Swing
// Jラベルによる文字列の表示