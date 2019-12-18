package design.pattern.prototype.example2;

public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1 = new Citation("张三","同学：在2019学年第一学期中表现优异，被评为三好学生"," [数据科学学院]。");
        obj1.display();
        Citation obj2 = (Citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}
