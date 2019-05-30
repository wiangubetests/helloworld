package com.wiangube.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wiangube.helloworld.models.SampleResponse;

@RestController
public class WebController {

	@RequestMapping("/baby")
	public SampleResponse baby(@RequestParam(value = "word", defaultValue = "") String word) {
		try {
			SampleResponse response = new SampleResponse();
			response.setId(1);
			
			if(word != "" & !word.isEmpty()) {
				response.setMessage("mmm? (don't understand what '"+ word +"' is");
			}
			else {
				response.setMessage("mmm");
			}			
			
			return response;
		} catch (Exception e) {
			SampleResponse response = new SampleResponse();
			response.setId(1);		
			response.setMessage("mmm? (don't understand you, I'm just a baby, remember?");
			
			return response;
		}
	}

	@RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value = "name", defaultValue = "Robot") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("Your name is" + name);
		return response;
	}
}