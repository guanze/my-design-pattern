package design.pattern.prototype.example1;

import javax.swing.*;

public class SunWukong extends JPanel implements Cloneable {
    private static final long serivalVersionUID = 5543049531872119328L;

    SunWukong(){
        JLabel jLabel = new JLabel(new ImageIcon("src/main/resources/img/Wukong.jpg"));
        this.add(jLabel);
    }

    public Object clone(){
        SunWukong sunWukong = null;
        try {
            sunWukong = (SunWukong) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            System.out.println("拷贝孙悟空失败！");
        }
        return sunWukong;
    }
}
