package com.feedback.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.main.constants.ResponseEntity;
import com.feedback.main.dto.FeedBackDto;
import com.feedback.main.service.FeedBackService;




@RestController
public class FeedbackController {
	
	Logger logger = LoggerFactory.getLogger(FeedbackController.class);
	@Autowired
	FeedBackService feedBackService;
	@CrossOrigin
	@PostMapping("/addFeedBack")
	public ResponseEntity<?> addFeedBack(@RequestBody FeedBackDto objectFeedBack){
		logger.info("####addFeedBack controller####");
		ResponseEntity<?> response =feedBackService.addFeedBack(objectFeedBack);
		return response;
		
	}
}
