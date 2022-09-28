package testngexample;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

class TestDetails1{
	@Test
	public void testmethod() {
		System.out.println("Test Cases1");
	}

	@Test
	public void testmethod1() {
		System.out.println("Test Cases2");
	}

}

class TestDetails2{
	@Test
	public void testmethod() {
		System.out.println("TestDetails'method");
	}
}


 class FactoryExample1 {
	 @Factory
		Object[] factoryMethod1() {
			return new Object[] { new TestDetails1(), new TestDetails2() };
		}
}
