package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.TestData;

public interface TestService {
	
	List<TestData> selectTestList() throws Exception;
	
	
	void insertData(TestData data) throws Exception;
}
