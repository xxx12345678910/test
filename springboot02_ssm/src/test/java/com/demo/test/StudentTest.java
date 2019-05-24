package com.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.App;
import com.demo.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
public class StudentTest {

	@Autowired
	private StudentService studentService;

	@Test
	public void test() {
		// 第一次查询
		System.out.println(this.studentService.findAll().get(0));

		// 第二次查询
		System.out.println(this.studentService.findAll().get(0));
	}
}
