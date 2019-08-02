package com.gyx.prototype.manager;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Admin
 * @description Created by IntelliJ IDEA.
 * @date 2019/8/1
 */

public class PrototypeManager{

    private Map<String,Shape> map = new HashMap<>();

    public PrototypeManager() {
        map.put("Circle",new Circle());
        map.put("Square",new Square());
    }

    public void addShape(String key,Shape value){
        map.put(key,value);
    }

    public Shape getShape(String key){
        return (Shape) map.get(key).clone();
    }

    public static void main(String[] args) {
        PrototypeManager prototypeManager = new PrototypeManager();
        Circle circle = (Circle)prototypeManager.getShape("Circle");
        circle.countArea();
        Square square = (Square)prototypeManager.getShape("Square");
        square.countArea();
    }

}
