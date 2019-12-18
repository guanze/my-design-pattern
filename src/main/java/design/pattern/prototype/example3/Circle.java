package design.pattern.prototype.example3;

import java.util.Scanner;

public class Circle implements Shape {
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("拷贝圆失败!");
        }
        return circle;
    }

    public void countArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("这是一个圆形，请输入半径：");
        int r = sc.nextInt();
        System.out.printf("圆的面积为：[%.2f]%n", (float) (Math.PI * r * r));

    }
}
