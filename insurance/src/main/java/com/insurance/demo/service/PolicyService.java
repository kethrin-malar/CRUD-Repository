package com.insurance.demo.service;

import java.util.List;

import com.insurance.demo.entity.PolicyEntity;


public interface PolicyService {
    String createPolicy(PolicyEntity policy);
    String updatePolicy(int id, PolicyEntity policy);
    String deletePolicy(int id);
    List<PolicyEntity> getAllPolicies();
}