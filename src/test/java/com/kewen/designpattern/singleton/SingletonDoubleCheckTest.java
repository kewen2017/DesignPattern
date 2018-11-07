package com.kewen.designpattern.singleton;

import org.junit.Test;

public class SingletonDoubleCheckTest {

    @Test
    /* 优点：延迟加载，线程安全 */
    /* 缺点： 写法复杂，不简洁*/
    public void method()
    {
        SingletonDoubleCheck.getInstance().method();
    }
}