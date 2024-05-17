package com.insurance.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.insurance.demo.business.PolicyBusiness;
import com.insurance.demo.entity.PolicyEntity;
import com.insurance.demo.repository.PolicyRepository;

@RestController
@RequestMapping("/policy")
@CrossOrigin(origins="*")
public class PolicyController {

    @Autowired
    private PolicyBusiness policyBusiness;

    @Autowired 
    private PolicyRepository policyRepository;
    
    @PostMapping("/create")
    public String createPolicy(@RequestBody PolicyEntity policy) {
    	System.out.println("^^^^^^^^^^^^^^^"+policy.getPolicy_Number());
        String msg = policyBusiness.createPolicy(policy);
        return msg;
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updatePolicy(@PathVariable int id, @RequestBody PolicyEntity policy) {
        String msg = policyBusiness.updatePolicy(id, policy);
        return ResponseEntity.ok(msg);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<PolicyEntity>> getAllPolicies() {
        List<PolicyEntity> policies = policyBusiness.getAllPolicies();
        return ResponseEntity.ok(policies);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePolicy(@PathVariable int id) {
        String msg = policyBusiness.deletePolicy(id);
        return ResponseEntity.ok(msg);
    }
    
   
}



