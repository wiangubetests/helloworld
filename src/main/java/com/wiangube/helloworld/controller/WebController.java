package com.wiangube.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wiangube.helloworld.models.SampleResponse;

@RestController
public class WebController {

	@RequestMapping("/school")
	public SampleResponse baby(@RequestParam(value = "city", defaultValue = "") String schoolName) {
		try {
			SampleResponse response = new SampleResponse();
			response.setId(1);
			
			if(schoolName != "" & !schoolName.isEmpty()) {
				response.setMessage("Studying in " + schoolName);
			}
			else {
				response.setMessage("In case you were wondering, I studied at 'ABC School'");
			}			
			
			return response;
			
		} catch (Exception e) {
			SampleResponse response = new SampleResponse();
			response.setId(1);		
			response.setMessage("Please repeat, I'm not a baby anymore but I still didn't understand you");
			
			return response;
		}
	}

	@RequestMapping("/mother")
	public SampleResponse mother(@RequestParam(value = "name", defaultValue = "") String motherName) {
		try {
			SampleResponse response = new SampleResponse();
			response.setId(1);
			
			if(motherName != "" & !motherName.isEmpty()) {
				response.setMessage("My mother name is " + motherName);
			}
			else {
				response.setMessage("In case you were wondering, my mother's name is Olga Bernal Murillo");
			}			
			
			return response;
			
		} catch (Exception e) {
			SampleResponse response = new SampleResponse();
			response.setId(1);		
			response.setMessage("Please repeat, I'm not a baby anymore but I still didn't understand you");
			
			return response;
		}
	}
}