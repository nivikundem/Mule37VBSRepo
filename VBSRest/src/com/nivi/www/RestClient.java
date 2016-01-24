package com.nivi.www;


import javax.ws.rs.core.MediaType;

import com.vbs.org.rest.VBRestInput;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;



public class RestClient {

  public static void main(String[] args) {
	  try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource("http://localhost:8080/VBSRest/api/json/VBLoad/post");
			
			VBRestInput vBRestInput = new VBRestInput();
			
			vBRestInput.setVBR("100");
			vBRestInput.setVRN("33");
		
			
		
			
		
			ClientResponse response = webResource.type("application/xml").post(ClientResponse.class, vBRestInput);

		
			
			
			
			
			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		  } catch (Exception e) {

			e.printStackTrace();

		  }
  }
} 