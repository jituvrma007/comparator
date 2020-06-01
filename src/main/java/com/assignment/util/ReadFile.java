package com.assignment.util;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ReadFile {

	public static List<String> readFile(String filePath) {

		List<String> fileContents = new LinkedList<String>();
		if (StringUtils.isBlank(filePath)) {
			return fileContents;
		}

		try {
			fileContents = Files.readAllLines(Paths.get(filePath));
		} catch (Exception e) {
			System.out.println(Constants.FILE_READ_ERROR);
			e.printStackTrace();
		}

		return fileContents;
	}
}
