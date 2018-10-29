package com.zetcode.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class CityTest {

	@Test
    public void test_toString() {
		City c = new City(1L, "Santa Barbara", 80000);
		String expected = "City{id=1, name=Santa Barbara, population=80000}";
        assertEquals(expected,c.toString());
    }
}
