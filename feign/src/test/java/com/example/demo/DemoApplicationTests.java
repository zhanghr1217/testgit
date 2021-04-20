package com.example.demo;

import com.example.demo.domain.RestfulResult;
import com.example.demo.domain.Student2;
import com.example.demo.repository.DefaultRepository;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
class DemoApplicationTests {
	@Autowired
	DefaultRepository defaultRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void inter(){
		//Student2 s = defaultRepository.getStu();
		System.out.println();

	}

}
