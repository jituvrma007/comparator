package com.assignment.unitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.assignment.util.JSONComparator;

public class JSONArrayComparatorTests extends JSONComparator{

	@Test
	public void compareEmptyArrays() {
		String jsonOne = "[]";
		String jsonTwo = "[]";
		assertTrue(isResponseEqual(jsonOne, jsonTwo));
	}

	@Test
	public void compareEmptyArrays_negative() {
		String jsonOne = "[1]";
		String jsonTwo = "[]";
		assertFalse(isResponseEqual(jsonOne, jsonTwo));
	}

	@Test
	public void compareArraysWithDuplicatedElements() {
		String jsonOne = "[2,2,4,4,4,3]";
		String jsonTwo = "[2,4,4,2,4,3]";
		assertTrue(isResponseEqual(jsonOne, jsonTwo));
	}

	@Test
	public void compareArraysWithDuplicatedElements_negative() {
		String jsonOne = "[2,2,2,4,4,4]";
		String jsonTwo = "[4,4,4,4,2,2]";
		assertTrue(isResponseEqual(jsonOne, jsonTwo));
	}

	@Test
	public void compareSimple() {
		String jsonOne = "[\"val1\",\"val2\"]";
		String jsonTwo = "[\"val2\",\"val1\"]";
		assertTrue(isResponseEqual(jsonOne, jsonTwo));
	}

	@Test
	public void compareSimple_negative() {
		String jsonOne = "[\"val1\",\"val2\"]";
		String jsonTwo = "[\"val2\",\"val3\"]";
		assertFalse(isResponseEqual(jsonOne, jsonTwo));
	}

	@Test
	public void compareWithNoExtraElements() {
		String jsonOne = "[4,1,\"test\"]";
		String jsonTwo = "[1,\"test\",4,\"!.*\"]";
		assertFalse(isResponseEqual(jsonOne, jsonTwo));
	}

	@Test
	public void deepCompareJsonArray() {
		String jsonOne = "[\"val2\",\"val1\",[10,20,false,[\"val3\"]]]";
		String jsonTwo = "[\"val2\",\"val1\",[10,20,false,[\"val3\"]]]";
		assertTrue(isResponseEqual(jsonOne, jsonTwo));
	}

	@Test
	public void deepCompareJsonArray_negative() {
		String jsonOne = "[\"val2\",\"val1\",[10,20,false,[\"val3\"]]]";
		String jsonTwo = "[\"val2\",\"val4\",[10,20,false,[\"val3\"]]]";
		assertFalse(isResponseEqual(jsonOne, jsonTwo));
	}
}
