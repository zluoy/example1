package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.TestData;

public class TestServiceImpl implements TestService{

	@Autowired
	TestService testService;
	
	@Override
	public List<TestData> selectTestList() throws Exception {
		// TODO Auto-generated method stub
		return testService.selectTestList();
	}

	@Override
	public void insertData(TestData data) throws Exception {
		// TODO Auto-generated method stub
		
		testService.insertData(data);
	}
	
	

}
