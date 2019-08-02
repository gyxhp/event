package com.gyx.prototype.manager;

import java.util.Random;

/**
 * @author Admin
 * @description Created by IntelliJ IDEA.
 * @date 2019/8/1
 */
public class Square implements Shape{

    @Override
    public Square clone() {
        Square square = null;
        try {
            square = (Square)super.clone();
            System.out.println("对象复制成功！");
        }catch (CloneNotSupportedException e){
            System.out.println("对象复制失败！");
            e.printStackTrace();
        }
        return square;
    }

    @Override
    public void countArea() {
        Random random = new Random();
        int l = random.nextInt();
        System.out.println("正方形直径为:"+l);
        System.out.println("正方形的面积为："+l*l);
    }
}
