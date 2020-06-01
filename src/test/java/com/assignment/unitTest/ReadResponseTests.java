package com.assignment.unitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.assignment.util.Constants;
import com.assignment.util.ReadResponse;

public class ReadResponseTests extends ReadResponse {

	@Test
	public void readResponseHTTPsApi() throws Exception {
		String expectedResponse = "{\"data\":{\"id\":2,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Janet\",\"last_name\":\"Weaver\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\"}}";
		assertEquals(getResponseFromAPI("https://reqres.in/api/users/2").get(), expectedResponse);
	}

	@Test
	public void readResponseHTTPApi() throws Exception {
		String Response = "{\"data\":{\"id\":2,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Janet\",\"last_name\":\"Weaver\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\"}}";
		assertEquals(getResponseFromAPI("http://reqres.in/api/users/2").get(), Response);
	}

	@Test
	public void readEmptyResponseHTTPsUri() throws Exception {
		assertEquals(getResponseFromAPI("https://reqres.in/api/users/98").get(), "{}");
	}

	@Test
	public void readEmptyResponseHTTPUri() throws Exception {
		assertEquals(getResponseFromAPI("http://reqres.in/api/users/98").get(), "{}");
	}

	@Test
	public void readResponseWrongUri() throws Exception {
		assertTrue(getResponseFromAPI("/com/api/101").get().contains(Constants.INVALID_URL_JSON_STRING));
	}
		
	@Test
	public void readResponseWrongHTTPsUri() throws Exception {
		assertTrue(getResponseFromAPI("https://www.reqrest.com/api/101").get().contains(Constants.INVALID_URL_JSON_STRING));
	}

	@Test
	public void readResponseWrongHTTPUri() throws Exception {
		assertTrue(getResponseFromAPI("http://www.reqrest.com/api/101").get().contains(Constants.INVALID_URL_JSON_STRING));
	}
	
}
