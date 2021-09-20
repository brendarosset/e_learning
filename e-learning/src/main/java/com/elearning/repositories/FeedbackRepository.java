package com.elearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.models.Feedback;


public interface FeedbackRepository extends JpaRepository<Feedback,Integer>{

}