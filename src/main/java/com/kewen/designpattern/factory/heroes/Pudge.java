package com.kewen.designpattern.factory.heroes;

import com.kewen.designpattern.factory.Hero;

/**
 * 这就是具体的英雄C
 */
public class Pudge implements Hero {
    @Override
    public String SkillOne()
    {
        return "钩子";
    }

    @Override
    public String SkillTwo()
    {
        return "腐烂";
    }

    @Override
    public String SkillThree()
    {
        return "被动";
    }
}
