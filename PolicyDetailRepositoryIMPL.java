package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.InsuranceRequest;
import com.example.demo.layer2.PolicyDetail;

@Repository
public class PolicyDetailRepositoryIMPL extends BaseRepository implements PolicyDetailRepository {

	@Transactional
	public void insertPolicyDetail(PolicyDetail Pref) {
		// TODO Auto-generated method stub
		super.persist(Pref);
	}

	@Transactional
	public PolicyDetail selectPolicyDetailByID(int policyno) {
		// TODO Auto-generated method stub
		return super.find(PolicyDetail.class, policyno);
	}

	@Transactional
	public List<PolicyDetail> selectAllPolicyDetails() {
		// TODO Auto-generated method stub
		return super.findAll("PolicyDetail");
	}

	@Transactional
	public void updateSinglePolicyDetails(PolicyDetail Pref) {
		// TODO Auto-generated method stub
		super.merge(Pref);
	}

	@Transactional
	public void deleteSinglePolicyDetails(int policyno) {
		// TODO Auto-generated method stub
		super.remove(PolicyDetail.class, policyno);
	}

}
