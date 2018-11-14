package com.kewen.designpattern.factory;

import org.junit.Test;
import org.apache.commons.lang3.StringUtils;

import static org.junit.Assert.*;
/**
 * 这种玩法的好处在于，新增了英雄之后，我只需要添加对应的英雄工程并且直接创建使用就完事了，不需要改动原有代码。
 * 在设计原则中符合开闭原则
 */
public class PomFactoryTest {

    @Test
    public void createHeroOne()
    {
        HeroFactory factory = new PomFactory();
        Object hero = factory.createHero();

        //这里就知道生产出来的实体是老虎
        assertTrue(StringUtils.equals("com.kewen.designpattern.factory.heroes.Pom",hero.getClass().getName()));
    }

    @Test
    public void createHeroTwo()
    {
        HeroFactory factory = new PomFactory();
        Object hero = factory.createHero();

        //这里就知道生产出来的实体是老虎
        String result = ((Hero) hero).SkillOne();
        assertTrue(StringUtils.equals("射箭",result));
    }

}