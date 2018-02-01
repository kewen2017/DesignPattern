package com.kewen.designpattern.singleton;

public class SingletonDemo {  
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static SingletonDemo instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private SingletonDemo() {}  
  
    /* 1:懒汉式，静态工程方法，创建实例 */  
    public static SingletonDemo getInstance() {  
        if (instance == null) {  
            instance = new SingletonDemo();  
        }  
        return instance;  
    }  
} 