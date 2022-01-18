package com.feedback.main.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.feedback.main.controller.FeedbackController;
import com.feedback.main.dto.FeedBackDto;



@Repository
public class FeedBackDaoImpl implements FeedbackDao{
	Logger logger = LoggerFactory.getLogger(FeedBackDaoImpl.class);
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int addFeedBack(FeedBackDto objectFeedBack) {
		logger.info("###########FeedBackDaoImpl#####");
		int status=0;
		String query = "INSERT INTO dbo.feedback(feedback,smiley,countryFlag) VALUES(?,?,?)";
		status = jdbcTemplate.update(query, objectFeedBack.getFeedback(), objectFeedBack.getSmiley(),
				objectFeedBack.getCountryFlag());
		return status;
	}

}
