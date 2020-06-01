package com.assignment.comparator;

import java.util.List;

public interface Comparator {
		
	public void isJsonEqual(String fileName1, String fileName2);

	public void isJsonEqual(List<String> urlsFile1, List<String> urlsFile2);

}
