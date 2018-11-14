package com.kewen.designpattern.factory.heroes;

import com.kewen.designpattern.factory.Hero;

/**
 * 这就是具体的英雄A
 */
public class NeverMore implements Hero {
    @Override
    public String SkillOne()
    {
        return "Z炮";
    }

    @Override
    public String SkillTwo()
    {
        return "X炮";
    }

    @Override
    public String SkillThree()
    {
        return "C炮";
    }
}
