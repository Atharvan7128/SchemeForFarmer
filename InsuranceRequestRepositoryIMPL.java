package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.InsuranceRequest;

@Repository
public class InsuranceRequestRepositoryIMPL extends BaseRepository implements  InsuranceRequestRepository {

	@Transactional
	public void insertRequest(InsuranceRequest IRref) {
		// TODO Auto-generated method stub
			super.persist(IRref);
	}

	@Transactional
	public InsuranceRequest selectRequestNo(int requestno) {
		// TODO Auto-generated method stub
		return super.find(InsuranceRequest.class, requestno);
	}

	@Transactional
	public List<InsuranceRequest> selectAllRequest() {
		// TODO Auto-generated method stub
		return super.findAll("InsuranceRequest");
	}

	@Transactional
	public void updateRequest(InsuranceRequest IRRef) {
		// TODO Auto-generated method stub
		super.merge(IRRef);
	}

	@Transactional
	public void deleteRequest(int requestno) {
		// TODO Auto-generated method stub
		super.remove(InsuranceRequest.class, requestno);
	}

}
