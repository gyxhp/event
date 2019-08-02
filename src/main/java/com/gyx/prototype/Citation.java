package com.gyx.prototype;

import javafx.scene.shape.Circle;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Admin
 * @description Created by IntelliJ IDEA.
 * @date 2019/8/1
 */
@Getter
@Setter
public class Citation implements Cloneable {

    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("对象创建成功！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        System.out.println("对象拷贝成功！");
        return (Citation)super.clone();
    }

    public void display(){
        System.out.println(name+info+college);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("张三","同学：在2016学年第一学期中表现优秀，被评为三好学生。","韶关学院");
        citation.display();
        Citation clone = citation.clone();
        clone.setName("李四");
        clone.display();
    }
}
