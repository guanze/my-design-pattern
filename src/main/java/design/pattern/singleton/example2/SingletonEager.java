package design.pattern.singleton.example2;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SingletonEager {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("[HungrySington Test]");
        jFrame.setLayout(new GridLayout(1,2));
        Container contentPane = jFrame.getContentPane();

        Bajie obj1 = Bajie.getInstance();
        contentPane.add(obj1);

        Bajie obj2 = Bajie.getInstance();
        contentPane.add(obj2);

        System.out.println("obj1==obj2 ? ["+(obj1==obj2)+"]");

        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
