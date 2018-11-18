package com.kewen.designpattern.factory;

import com.kewen.designpattern.factory.heroes.NeverMore;
import com.kewen.designpattern.factory.heroes.Pom;
import com.kewen.designpattern.factory.heroes.Pudge;

public class SimpleFactory4Hero {
    /**
     * 简单工厂模式，根据入参直接返回实体类。  工厂本身和核心业务逻辑、判断逻辑合并在一个Java类中展示
     * @param weapon
     * @return Hero
     */
    public static Hero createHero(String weapon)
    {
        switch (weapon)
        {
            case "弓":
                return new Pom();
            case "钩子":
                return new Pudge();
            case "影子":
                return new NeverMore();
        }
        return null;
    }
}
