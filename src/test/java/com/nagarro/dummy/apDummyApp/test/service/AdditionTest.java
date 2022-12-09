package com.nagarro.dummy.apDummyApp.test.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nagarro.dummy.apDummyApp.service.AdditionService;

public class AdditionTest {
		@Test
		public void testAdditionOfNumbers() {
			AdditionService service = new AdditionService();
			int a = 10;
			int b = 20;
			int c = service.getAdditionResult(a, b);
			assertEquals(30, c);
		}
}
