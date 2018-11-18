package com.kewen.designpattern.factory;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * 简单工厂模式单元测试
 */
public class SimpleFactory4HeroTest {
    @Test
    public void createPom()
    {
        Hero hero = SimpleFactory4Hero.createHero("弓");

        Assert.assertTrue(StringUtils.equals(hero.getClass().getName(), "com.kewen.designpattern.factory.heroes.Pom"));
    }

    @Test
    public void createPudge()
    {
        Hero hero = SimpleFactory4Hero.createHero("钩子");

        Assert.assertTrue(StringUtils.equals(hero.getClass().getName(), "com.kewen.designpattern.factory.heroes.Pudge"));
    }

    @Test
    public void createPis()
    {
        Hero hero = SimpleFactory4Hero.createHero("影子");

        Assert.assertTrue(StringUtils.equals(hero.getClass().getName(), "com.kewen.designpattern.factory.heroes.NeverMore"));
    }

    @Test
    public void createNothing()
    {
        Hero hero = SimpleFactory4Hero.createHero("12345");

        Assert.assertNull(hero);
    }
}