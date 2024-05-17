package com.insurance.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.demo.entity.PolicyEntity;
import com.insurance.demo.repository.PolicyRepository;
import com.insurance.demo.service.PolicyService;


@Service
public class PolicyServiceImpl implements PolicyService {
    @Autowired
    private PolicyRepository policyRepository;

    @Override
    public String createPolicy(PolicyEntity policy) {
    	policyRepository.save(policy);
    	return "Policy created successfully";
    }
    @Override
    public List<PolicyEntity> getAllPolicies() {
        return policyRepository.findAll();
    }
       
    @Override
    public String updatePolicy(int id, PolicyEntity policy) {
        PolicyEntity existingPolicy = policyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Policy not found with id: " + id));

        // Update existing policy fields
        existingPolicy.setPolicy_Number(policy.getPolicy_Number());
        existingPolicy.setPolicy_Effective_Date(policy.getPolicy_Effective_Date());
        existingPolicy.setPolicy_Expire_Date(policy.getPolicy_Expire_Date());
        existingPolicy.setPayment_Option(policy.getPayment_Option());
        existingPolicy.setTotal_Amount(policy.getTotal_Amount());
        existingPolicy.setCreated_Date(policy.getCreated_Date());

        policyRepository.save(existingPolicy);
        return "Policy updated successfully";
    }
    
    @Override
    public String deletePolicy(int id) {
        if (policyRepository.existsById(id)) {
            policyRepository.deleteById(id);
            return "Policy deleted successfully";
        } else {
            return "Policy with ID " + id + " not found";
        }
    }
    
}


