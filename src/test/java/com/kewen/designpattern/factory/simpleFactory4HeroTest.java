package com.kewen.designpattern.factory;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 简单工厂模式单元测试
 */
public class simpleFactory4HeroTest {
    @Test
    public void createPom()
    {
        simpleFactory4Hero factor = new simpleFactory4Hero();
        Hero hero = factor.createHero("弓");

        Assert.assertTrue(StringUtils.equals(hero.getClass().getName(), "com.kewen.designpattern.factory.heroes.Pom"));
    }

    @Test
    public void createPudge()
    {
        simpleFactory4Hero factor = new simpleFactory4Hero();
        Hero hero = factor.createHero("钩子");

        Assert.assertTrue(StringUtils.equals(hero.getClass().getName(), "com.kewen.designpattern.factory.heroes.Pudge"));
    }

    @Test
    public void createPis()
    {
        simpleFactory4Hero factor = new simpleFactory4Hero();
        Hero hero = factor.createHero("影子");

        Assert.assertTrue(StringUtils.equals(hero.getClass().getName(), "com.kewen.designpattern.factory.heroes.NeverMore"));
    }

    @Test
    public void createNothing()
    {
        simpleFactory4Hero factor = new simpleFactory4Hero();
        Hero hero = factor.createHero("12345");

        Assert.assertNull(hero);
    }
}