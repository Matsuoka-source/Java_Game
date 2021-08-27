public class Sample2 {
  public static void main(String[] args) {
    System.out.println("hello world!!");
    javax.swing.JFrame jf = new javax.swing.JFrame();
    jf.setBounds(20, 50, 300, 200);// 最初の二つが表示したい場所 windowの幅
    jf.setVisible(true);// windowを表示する。
    jf.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);// windowを閉じるとプログラムも終了する
  }
}

// windowサイズが小さい
// 表示場所
// windowを消してもプログラムが終了しない