package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.InsuranceRequest;

@Repository
public interface InsuranceRequestRepository {
	void insertRequest(InsuranceRequest IRref);
	InsuranceRequest selectRequestNo(int requestno);
	List<InsuranceRequest> selectAllRequest();
	void deleteRequest(int requestno);
	void updateRequest(InsuranceRequest IRref);
	
}
