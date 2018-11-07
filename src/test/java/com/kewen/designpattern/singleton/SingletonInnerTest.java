package com.kewen.designpattern.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonInnerTest {

    @Test
    /* 优点：延迟加载，线程安全（java中class加载时互斥的），也减少了内存消耗，推荐使用内部类方式。 */
    public void method()
    {
        SingletonInner.getInstance().method();
    }
}