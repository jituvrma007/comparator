package com.assignment.unitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.assignment.util.ReadFile;

public class ReadFileTests extends ReadFile{
	
	@Test
	public void readEmptyFile() {
		assertEquals(readFile(System.getProperty("user.dir")+ "/Files/File2.txt"), new LinkedList<>());	
	}
	
	@Test
	public void readFileContent() {
		
		List<String> fileContents = new LinkedList<>();
		fileContents.add("https://reqres.in/api/users?page=2");
		fileContents.add("https://reqres.in/api/users/2");
		fileContents.add("https://reqres.in/");
		fileContents.add("https://reqres.in/api/unknown");
		fileContents.add("/api/unknown");
		
		assertEquals(readFile(System.getProperty("user.dir")+ "/Files/File1.txt"), fileContents);
	}
	
	@Test
	public void checkEmptyFilePath() {
		assertEquals(readFile(""), new LinkedList<>());	
	}
	
	@Test
	public void checkOtherTextTypeFile_negative() {
		
		assertNotNull(readFile(System.getProperty("user.dir")+ "/src/main/java/com/assignment/util/ReadFile.java"));	
	}
}
