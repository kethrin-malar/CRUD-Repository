package com.insurance.demo.business;

import java.util.List;

import com.insurance.demo.entity.PolicyEntity;

public interface PolicyBusiness {
	 public String createPolicy(PolicyEntity policy);
	 String updatePolicy(int id, PolicyEntity policy);
	 String deletePolicy(int id);
	 List<PolicyEntity> getAllPolicies();
	}
