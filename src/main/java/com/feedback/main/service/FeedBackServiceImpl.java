package com.feedback.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.main.constants.ResponseCode;
import com.feedback.main.constants.ResponseDescription;
import com.feedback.main.constants.ResponseEntity;
import com.feedback.main.constants.ResponseMessage;
import com.feedback.main.dto.FeedBackDto;
import com.feedback.main.repository.FeedbackDao;




@Service
public class FeedBackServiceImpl implements FeedBackService {
	@Autowired FeedbackDao feeddbackDao;

	@Override
	public ResponseEntity<?> addFeedBack(FeedBackDto objectFeedBack) {
		ResponseEntity<?> response=null;
		int status=feeddbackDao.addFeedBack(objectFeedBack);
		if(status==1) {
			response=new ResponseEntity<>( ResponseCode.SUCCESS, ResponseMessage.SAVE_DATA,ResponseDescription.SAVE_DATA,objectFeedBack);
		}else {
			response=new ResponseEntity<>( ResponseCode.FAILED, ResponseMessage.SAVE_FAILED,ResponseDescription.SAVE_FAILED,objectFeedBack);
		}	
		return response;
	}

}
