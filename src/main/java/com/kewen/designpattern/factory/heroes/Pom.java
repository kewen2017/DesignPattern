package com.kewen.designpattern.factory.heroes;

import com.kewen.designpattern.factory.Hero;

/**
 * 这就是具体的英雄B
 */
public class Pom implements Hero {
    @Override
    public String SkillOne()
    {
        return "射箭";
    }

    @Override
    public String SkillTwo()
    {
        return "跳";
    }

    @Override
    public String SkillThree()
    {
        return "流星雨";
    }
}
