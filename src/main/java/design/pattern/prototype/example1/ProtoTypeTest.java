package design.pattern.prototype.example1;

import javax.swing.*;
import java.awt.*;

public class ProtoTypeTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("原型模式测试");
        jFrame.setLayout(new GridLayout(1,2));
        Container contentPane = jFrame.getContentPane();
        SunWukong sunWukong1 = new SunWukong();
        contentPane.add(sunWukong1);
        SunWukong sunWukong2 = (SunWukong) sunWukong1.clone();
        contentPane.add(sunWukong2);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
