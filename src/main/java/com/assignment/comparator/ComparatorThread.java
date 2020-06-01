package com.assignment.comparator;

import com.assignment.util.Constants;
import com.assignment.util.JSONComparator;
import com.assignment.util.ReadResponse;

public class ComparatorThread implements Runnable {

	public String url1;
	public String url2;

	ComparatorThread(String url1, String url2) {
		this.url1 = url1;
		this.url2 = url2;
	}

	@Override
	public void run() {

		try {
			String s1 = ReadResponse.getResponseFromAPI(url1).get();
			String s2 = ReadResponse.getResponseFromAPI(url2).get();

			if (s1.contains(Constants.INVALID_URL_JSON_STRING) || s2.contains(Constants.INVALID_URL_JSON_STRING))
				System.out.println(url1 + Constants.NOT_EQUALS + url2);
			// Assuming invalid URLs are always not equal with other urls
			else if (JSONComparator.isResponseEqual(s1, s2))
				System.out.println(url1 + Constants.EQUALS + url2);
			else
				System.out.println(url1 + Constants.NOT_EQUALS + url2);

		} catch (Exception e) {
			System.out.println(Constants.EXCEPTION_OCCURED);
			e.printStackTrace();
		}
	}

}
