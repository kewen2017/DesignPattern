package com.kewen.designpattern.factory;

import com.kewen.designpattern.factory.heroes.Pudge;

public class PudgeFactory extends HeroFactory {
    @Override
    Hero createHero()
    {
        return new Pudge();
    }
}
