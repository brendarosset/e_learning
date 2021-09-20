package com.elearning.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.models.Feedback;
import com.elearning.repositories.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	FeedbackRepository feedRep;
	public void addFeedback(Feedback feedback) {
		feedRep.save(feedback);
	}
	public List<Feedback> findAllFeedback() {
		return feedRep.findAll();
	}
}
