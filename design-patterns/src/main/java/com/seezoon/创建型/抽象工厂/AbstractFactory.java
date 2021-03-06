package com.seezoon.创建型.抽象工厂;

/**
 * 抽象工厂
 * @author DF
 *工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，
 *必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？
 *就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，
 *不需要修改之前的代码
 */
public class AbstractFactory {

	public static void main(String[] args) {
		IFactory factory = new ProductAFactory();
		IProduct product = factory.produce();
		product.productMethod();
	}
	
}
interface IFactory {
	public IProduct produce();
}
class ProductAFactory implements IFactory{

	@Override
	public IProduct produce() {
		return new ProductA();
	}
}
class ProductBFactory implements IFactory{

	@Override
	public IProduct produce() {
		return new ProductB();
	}
}
interface IProduct {
	public void productMethod();
}

class ProductA implements IProduct {
	@Override
	public void productMethod() {
		System.out.println("ProductA");
	}
}

class ProductB implements IProduct {
	@Override
	public void productMethod() {
		System.out.println("ProductB");
	}
}