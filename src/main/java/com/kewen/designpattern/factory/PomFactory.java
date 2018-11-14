package com.kewen.designpattern.factory;

import com.kewen.designpattern.factory.heroes.Pom;

public class PomFactory  extends HeroFactory{
    @Override
    Hero createHero()
    {
        return new Pom();
    }
}
