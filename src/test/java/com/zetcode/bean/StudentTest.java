package com.zetcode.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class StudentTest {

	@Test
    public void test_setId_getId() {
		Student s = new Student();
		s.setId(7L);
		assertEquals(7L,s.getId());
    }

	@Test
    public void test_setPerm_getPerm() {
		Student s = new Student();
		s.setPerm(1234567);
		assertEquals(1234567,s.getPerm());
    }

}
