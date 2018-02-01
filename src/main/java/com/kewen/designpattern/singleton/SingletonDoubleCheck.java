package com.kewen.designpattern.singleton;

public class SingletonDoubleCheck
{
	private static volatile SingletonDoubleCheck sInst = null; // <<< 这里添加了
																// volatile

	/**
	 * 私有的构造函数
	 */
	private SingletonDoubleCheck()
	{

	}

	public static SingletonDoubleCheck getInstance()
	{
		SingletonDoubleCheck inst = sInst; // <<< 在这里创建临时变量
		if (inst == null)
		{
			synchronized (SingletonDoubleCheck.class)
			{
				inst = sInst;
				if (inst == null)
				{
					inst = new SingletonDoubleCheck();
					sInst = inst;
				}
			}
		}
		return inst; // <<< 注意这里返回的是临时变量
	}

	protected void method()
	{
		System.out.println("SingletonInner");
	}
}
