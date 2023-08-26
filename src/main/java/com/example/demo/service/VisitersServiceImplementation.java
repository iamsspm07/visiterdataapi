package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.VisitersDao;
import com.example.demo.models.VisitersParameters;

@Service
public class VisitersServiceImplementation implements VisiterServiceInterface{
	
	@Autowired
	VisitersDao visitersDao;

	@Override
	public VisitersParameters saveVisiter(VisitersParameters visitersParameters) {
		return visitersDao.save(visitersParameters);
	}

	@Override
	public List<VisitersParameters> getAllVisitors() {
		return visitersDao.findAll();
	}

}
