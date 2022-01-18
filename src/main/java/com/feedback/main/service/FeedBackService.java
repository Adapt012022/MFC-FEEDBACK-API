package com.feedback.main.service;

import com.feedback.main.constants.ResponseEntity;
import com.feedback.main.dto.FeedBackDto;

public interface FeedBackService {

	ResponseEntity<?> addFeedBack(FeedBackDto objectFeedBack);

}
