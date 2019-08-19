package com.example.java_base;

import com.example.java_base.thread.lock.ReentrantLockTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaBaseApplicationTests {

	@Resource
	ReentrantLockTest reentrantLockTest;

	@Test
	public void reen(){
		reentrantLockTest.fair();
	}


}
