package com.cunshan.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void sayHello(){
		System.out.println("hello ");
		System.out.println("hello world");
		System.out.println("test");
		System.out.println("testMerge");
		System.out.println("test2");
	}

}
