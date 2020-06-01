package com.assignment.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONComparator {

	public static boolean isResponseEqual(String obj1, String obj2) {
		if (obj1.length() == 0 || obj2.length() == 0 || obj1 == null || obj2 == null) {
			System.out.println(Constants.EMPTY_INPUT);
			return false;
		}
		Object obj1Parsed = parseJSON(obj1);
		Object obj2Parsed = parseJSON(obj2);

		return obj1Parsed.equals(obj2Parsed);

	}

	private static Object parseJSON(Object JSON) {
		try {
			Object json = new JSONTokener(JSON.toString()).nextValue();

			if (json instanceof JSONObject) {
				JSONObject obj = (JSONObject) json;
				Iterator<String> keys = obj.keys();
				Map<String, Object> jsonMap = new HashMap<String, Object>();
				while (keys.hasNext()) {
					String key = keys.next();
					jsonMap.put(key, parseJSON(obj.get(key)));
				}
				return jsonMap;
			} else if (json instanceof JSONArray) {
				JSONArray arr = (JSONArray) json;
				Set<Object> jsonSet = new HashSet<Object>();
				for (int i = 0; i < arr.length(); i++) {
					jsonSet.add(parseJSON(arr.get(i)));
				}
				return jsonSet;
			} else
				return json;

		} catch (Exception e) {
		}
		return "";
	}
}
