package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.PolicyDetail;

@Repository
public interface PolicyDetailRepository {
	void insertPolicyDetail(PolicyDetail Pref);
	PolicyDetail selectPolicyDetailByID(int policyno);
	List<PolicyDetail> selectAllPolicyDetails();
	void updateSinglePolicyDetails(PolicyDetail Pref);
	void deleteSinglePolicyDetails(int policyno);
}
