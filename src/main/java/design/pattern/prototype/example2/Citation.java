package design.pattern.prototype.example2;

public class Citation implements Cloneable {
    private String name;
    private String info;
    private String college;

    Citation(String name, String info, String college) {
        this.setName(name);
        this.setInfo(info);
        this.setCollege(college);
        System.out.println("创建奖状成功!");
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setInfo(String info) {
        this.info = info;
    }

    private void setCollege(String college) {
        this.college = college;
    }

    public void display() {
        System.out.println(this.name + this.info + this.college);
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return super.clone();
    }
}
