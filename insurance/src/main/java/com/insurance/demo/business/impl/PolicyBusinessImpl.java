package com.insurance.demo.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.demo.business.PolicyBusiness;
import com.insurance.demo.entity.PolicyEntity;
import com.insurance.demo.service.PolicyService;


@Service
public class PolicyBusinessImpl implements PolicyBusiness {

    @Autowired
    private PolicyService policyService;

    public String createPolicy(PolicyEntity policy) {
        // Add any additional business logic here if needed
        String msg = policyService.createPolicy(policy);
        return msg;
    }
    
    
    @Override
    public List<PolicyEntity> getAllPolicies() {
        return policyService.getAllPolicies();
    }
    
    @Override
    public String updatePolicy(int id, PolicyEntity policy) {
        return policyService.updatePolicy(id, policy);
    }
    
    @Override
    public String deletePolicy(int id) {
        // Add any additional business logic here if needed
        return policyService.deletePolicy(id);
    }
}
