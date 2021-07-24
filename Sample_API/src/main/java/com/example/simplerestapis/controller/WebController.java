package com.example.simplerestapis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplerestapis.models.SampleResponse;

	@RestController
	public class WebController {

		@RequestMapping("/sample")
		public SampleResponse Sample(@RequestParam(value = "name",
		defaultValue = "Robot") String name) {
			SampleResponse response = new SampleResponse();
			response.setId(1);
			response.setMessage("Your name is "+name);
			return response;

		}
	}

