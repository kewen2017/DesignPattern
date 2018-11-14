package com.kewen.designpattern.factory;

/**
 * 抽象英雄工厂，具体英雄工程有自己的具体创建对象
 */
public abstract class HeroFactory {

    abstract Hero createHero();

}
