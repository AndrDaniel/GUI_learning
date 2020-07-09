import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        setSize(300,200);
        setTitle("My first window");
    }
    public static void main(String[] args) {
        MyWindow  window = new MyWindow();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
