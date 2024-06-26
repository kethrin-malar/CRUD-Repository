package com.insurance.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.demo.entity.DriverEntity;
import com.insurance.demo.entity.PolicyEntity;
import com.insurance.demo.model.Driver;
import com.insurance.demo.model.Policy;
import com.insurance.demo.repository.DashboardRepository;
import com.insurance.demo.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService{

	@Autowired
	private DashboardRepository dashboardRepository;
	
	@Override
	public Driver getDriverById(long driverId) {
		DriverEntity driverEntity = dashboardRepository.findById((int)driverId).get();
        return mapDriverEntityToModel(driverEntity);
	}
	
private Driver mapDriverEntityToModel(DriverEntity driverEntity) {
	Driver driver = new Driver();
    if (driverEntity != null) {
    	driver.setId(driverEntity.getId());
    	if(driverEntity.getPolicy()!=null) {
    		Policy policy = new Policy();
    		policy.setId(driverEntity.getPolicy().getId());
    		policy.setPolicy_Number(driverEntity.getPolicy().getPolicy_Number());
    		policy.setPolicy_Effective_Date(driverEntity.getPolicy().getPolicy_Effective_Date());
    		policy.setPolicy_Expire_Date(driverEntity.getPolicy().getPolicy_Expire_Date());
    		policy.setPayment_Option(driverEntity.getPolicy().getPayment_Option());
    		policy.setTotal_Amount(driverEntity.getPolicy().getTotal_Amount());
    		policy.setCreated_Date(driverEntity.getPolicy().getCreated_Date());
    		
    		driver.setPolicy(policy);
    	}
    	driver.setFirst_Name(driverEntity.getFirst_Name());
        driver.setLast_Name(driverEntity.getLast_Name());
        driver.setDate_Of_Birth(driverEntity.getDate_Of_Birth());
        driver.setPhone_Number(driverEntity.getPhone_Number());
        driver.setLicense_Issued_Date(driverEntity.getLicense_Issued_Date());
        driver.setLicense_Issued_State(driverEntity.getLicense_Issued_State());
        driver.setLicense_Number(driverEntity.getLicense_Number());
        driver.setCreated_Date(driverEntity.getCreated_Date());
            }
    return driver;
}
}