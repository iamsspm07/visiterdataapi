package com.example.demo.service;

import java.util.List;

import com.example.demo.models.VisitersParameters;

public interface VisiterServiceInterface {
	
	VisitersParameters saveVisiter(VisitersParameters visitersParameters);
	
	public List<VisitersParameters> getAllVisitors();

}
