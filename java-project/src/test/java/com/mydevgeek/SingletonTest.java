package com.mydevgeek;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void singletonTest() {
		Singleton.INSTANCE.setCount(1);
		Singleton.INSTANCE.setCount(2);
		Singleton.INSTANCE.doProcess();
		Singleton.INSTANCE.doProcess();
		Singleton.INSTANCE.doProcess();
	}

}
