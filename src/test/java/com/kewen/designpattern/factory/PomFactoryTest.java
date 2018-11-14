package com.kewen.designpattern.factory;

import org.junit.Test;
import org.apache.commons.lang3.StringUtils;

import static org.junit.Assert.*;

public class PomFactoryTest {

    @Test
    public void createHeroOne()
    {
        HeroFactory factory = new PomFactory();
        Object hero = factory.createHero();

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