package javaapplication1;

import javax.swing.JFrame;

public class JavaApplication1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String s = new String("frame " + Integer.toString(i));
            JFrame obj = new NewJFrame(s);
            obj.setVisible(true);
        }

//        NewJFrame nf1 = new NewJFrame();
//        NewJFrame nf2 = new NewJFrame();
//        NewJFrame nf3 = new NewJFrame();
//        NewJFrame nf4 = new NewJFrame();
//        nf1.setVisible(true);
//        nf2.setVisible(true);
//        nf3.setVisible(true);
//        nf4.setVisible(true);
//        nf1.setNama("frame A");
//        nf2.setNama("frame B");
//        nf3.setNama("frame C");
//        nf4.setNama("frame D");
    }

}
