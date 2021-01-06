package com.test;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.client.RestClient;

public class GetApiTest extends Base {

	Base base;
	RestClient client;
	String endPoint;

	@BeforeMethod
	public void setUp() {
		base = new Base();
		String baseUrl = prop.getProperty("baseUrl");
		String serviceUri = prop.getProperty("serviceUri");
		endPoint = baseUrl + serviceUri;

	}

	@Test
	private void getApiTest() throws ClientProtocolException, IOException {
		client = new RestClient();
		client.get(endPoint);
	}
}
