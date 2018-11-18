package com.kewen.designpattern.singleton;

import org.junit.Test;

public class SingletonTest {

	@Test
	/* 优点：延迟加载（需要的时候才去加载）,适合单线程操作 */
	/* 缺点： 线程不安全，在多线程中很容易出现不同步的情况，如在数据库对象进行的频繁读写操作时。*/
	public void method()
	{
		Singleton.getInstance().method();
	}
	
} 