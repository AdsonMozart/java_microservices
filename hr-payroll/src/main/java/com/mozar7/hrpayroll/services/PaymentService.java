package com.mozar7.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mozar7.hrpayroll.entities.Payment;
import com.mozar7.hrpayroll.entities.Worker;
import com.mozar7.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		
		Worker worker = workerFeignClient.findByID(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
