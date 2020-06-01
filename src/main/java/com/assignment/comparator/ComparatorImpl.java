package com.assignment.comparator;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.assignment.util.Constants;
import com.assignment.util.JSONComparator;
import com.assignment.util.ReadFile;


public class ComparatorImpl implements Comparator {

	JSONComparator jsonComparator = new JSONComparator();

	public void isJsonEqual(String fileName1, String fileName2) {
		if (StringUtils.isBlank(fileName1) || StringUtils.isBlank(fileName2)) {
			System.out.println(Constants.EMPTY_URL_LIST);
			return;
		}

		List<String> f1 = ReadFile.readFile(fileName1);
		List<String> f2 = ReadFile.readFile(fileName2);
		isJsonEqual(f1, f2);
	}

	public void isJsonEqual(List<String> urlsFile1, List<String> urlsFile2) {

		if (urlsFile1.size() == 0 || urlsFile2.size() == 0) {
			System.out.println(Constants.EMPTY_URL_LIST);
			return;
		}

		int n = Integer.min(urlsFile1.size(), urlsFile2.size());
		// For comparison we need two URLs. In case the count of urls are not same in
		// both the files then we will compare only those URLs which are appearing first in the file.

		for (int i = 0; i < n; i++) {
			new Thread(new ComparatorThread(urlsFile1.get(i), urlsFile2.get(i))).start();
		}
	}
}
