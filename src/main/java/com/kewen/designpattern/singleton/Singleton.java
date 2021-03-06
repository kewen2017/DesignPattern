package com.kewen.designpattern.singleton;

public class Singleton
{
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static Singleton instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton()
	{

	}

	/* 1:懒汉式，静态工厂方法，创建实例 */
	public static Singleton getInstance()
	{
		if (instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}

	protected void method()
	{
		System.out.println("Singleton");
	}

}