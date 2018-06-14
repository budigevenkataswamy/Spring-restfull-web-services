package com.venkat.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			
			//create object mapper
			ObjectMapper mapper=new ObjectMapper();
			
			//read json file read and map/convert to java POJO: data/sample-full.json
			//data/sample-lite.json
			
			Student theStudent = 
					mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print first name and last name
			System.out.println("Firstname="+theStudent.getFirstName());
			System.out.println("lastname="+theStudent.getLastName());
			
			Address tempAddress=theStudent.getAddress();
			System.out.println("street="+tempAddress.getStreet());
			System.out.println("city="+tempAddress.getCity());
			
			for(String tempLang:theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
 			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
