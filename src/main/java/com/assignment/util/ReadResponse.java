package com.assignment.util;

import static com.jayway.restassured.RestAssured.given;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class ReadResponse {

	public static CompletableFuture<String> getResponseFromAPI(String apiUri) {

		try {
			URL uri = new URL(apiUri);
			HttpURLConnection urlConnection = (HttpURLConnection) uri.openConnection();
			urlConnection.setRequestMethod("GET");
			urlConnection.connect();
			// Checking if URL is correct, in case of issues it will go in Exception block.

			return CompletableFuture
					.supplyAsync(() -> given().when().get(apiUri).then().extract().response().asString());

		} catch (Exception e) {
			System.out.println(Constants.INVALID_URL + apiUri);
			return CompletableFuture
					.supplyAsync(() -> "{" + "\"" + Constants.INVALID_URL_JSON_STRING + "\":\"" + apiUri + "\"}");
		}
	}
}
