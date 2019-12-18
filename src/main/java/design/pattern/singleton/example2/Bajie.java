package design.pattern.singleton.example2;

import javax.swing.*;

public class Bajie extends JPanel{
    private static Bajie instance = new Bajie();

    private Bajie(){
        JLabel jLabel = new JLabel(new ImageIcon("src/main/resources/img/Bajie.jpg"));
        this.add(jLabel);
    }

    public static Bajie getInstance(){
        return instance;
    }
}
