package com.gyx.prototype.manager;

import java.util.Random;

/**
 * @author Admin
 * @description Created by IntelliJ IDEA.
 * @date 2019/8/1
 */
public class Circle implements Shape {

    @Override
    public Circle clone() {
        Circle circle = null;
        try {
            Circle clone = (Circle)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("对象拷贝失败！");
            e.printStackTrace();
        }
        return circle;
    }

    @Override
    public void countArea() {
        Random random = new Random();
        int r = random.nextInt();
        System.out.println("圆的半径为："+r);
        System.out.println("圆的面积为:"+3.1415*r*r);
    }
}
