package design.pattern.prototype.example3;

import java.util.Scanner;

public class Square implements Shape {
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("拷贝正方形失败!");
        }
        return square;
    }

    public void countArea() {
        System.out.println("这是一个正方形，请输入边长：");
        Scanner sc = new Scanner(System.in);
        int sideLength = sc.nextInt();
        System.out.println("正方形的面积为：[" + (sideLength * sideLength) + "]");
    }
}
