package com.test.restclient;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	public static void main(String[] args) 
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity <String> entity = new HttpEntity<String>(headers);

		RestTemplate restTemplate = new RestTemplate();
		
		System.out.println(restTemplate.exchange("http://localhost:8888/topics", HttpMethod.GET, entity, String.class).getBody());
		
		System.out.println(restTemplate.exchange("http://localhost:8888/topics/Java", HttpMethod.GET, entity, String.class).getBody());
		
		System.out.println(restTemplate.exchange("http://localhost:8888/topics/", HttpMethod.POST, entity, String.class).getBody());
		
	}

}
